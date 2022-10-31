/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class Nsx {

    private String idNsx;
    private String ma;
    private String ten;

    public Nsx() {
    }

    public Nsx(String idNsx, String ma, String ten) {
        this.idNsx = idNsx;
        this.ma = ma;
        this.ten = ten;
    }

    public Nsx(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public Nsx(String ten) {
        this.ten = ten;
    }

    public String getIdNsx() {
        return idNsx;
    }

    public void setIdNsx(String idNsx) {
        this.idNsx = idNsx;
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
        return ten + '-' + idNsx;
    }

    public Object[] toRowData() {
        return new Object[]{idNsx, ma, ten};
    }
}
