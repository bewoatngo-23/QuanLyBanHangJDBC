/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class DongSanPham {

    private String idDongSP;
    private String ma;
    private String ten;

    public DongSanPham() {
    }

    public DongSanPham(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public DongSanPham(String idDongSP, String ma, String ten) {
        this.idDongSP = idDongSP;
        this.ma = ma;
        this.ten = ten;
    }

    public String getIdDongSP() {
        return idDongSP;
    }

    public DongSanPham(String ten) {
        this.ten = ten;
    }

    public void setIdDongSP(String idDongSP) {
        this.idDongSP = idDongSP;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return ten + '-' + idDongSP;
    }

    public Object[] toRowData() {
        return new Object[]{idDongSP, ma, ten};
    }

}
