/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class MauSac {

    private String idMauSac;
    private String ma;
    private String ten;

    public MauSac() {
    }

    public MauSac(String idMauSac, String ma, String ten) {
        this.idMauSac = idMauSac;
        this.ma = ma;
        this.ten = ten;
    }

    public MauSac(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public MauSac(String ten) {
        this.ten = ten;
    }

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
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
        return ten + '-' + idMauSac;
    }

    public Object[] toRowData() {
        return new Object[]{idMauSac, ma, ten};
    }
}
