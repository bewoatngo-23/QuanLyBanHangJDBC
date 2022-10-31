/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class SanPham {

    private String idSP;
    private String ma;
    private String ten;

    public SanPham() {
    }

    public SanPham(String idSP, String ma, String ten) {
        this.idSP = idSP;
        this.ma = ma;
        this.ten = ten;
    }

    public SanPham(String ten) {
        this.ten = ten;
    }

    public SanPham(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
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
        return ten + '-' + idSP;
    }

    public Object[] toRowData() {
        return new Object[]{idSP, ma, ten};
    }
}
