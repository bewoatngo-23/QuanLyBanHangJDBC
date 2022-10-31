/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class ChucVu {

    private String idCV;
    private String ma;
    private String ten;

    public ChucVu() {
    }

    public ChucVu(String idCV, String ma, String ten) {
        this.idCV = idCV;
        this.ma = ma;
        this.ten = ten;
    }

    public ChucVu(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public ChucVu(String idCV) {
        this.idCV = idCV;
    }

    public String getIdCV() {
        return idCV;
    }

    public void setIdCV(String idCV) {
        this.idCV = idCV;
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
        return ten + " - " + idCV;
    }

    public Object[] toRowData() {
        return new Object[]{idCV, ma, ten};
    }
}
