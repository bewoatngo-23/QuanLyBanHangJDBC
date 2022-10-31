/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class ChiTietSanPham {

    private String idCTSP;
    private String tenSP;
    private String tenNSX;
    private String tenMauSac;
    private String tenDongSP;
    private int namBH;
    private String moTa;
    private int soLuongTon;
    private Double giaNhap;
    private Double giaBan;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String idCTSP, String tenSP, String tenNSX, String tenMauSac, String tenDongSP, int namBH, String moTa, int soLuongTon, Double giaNhap, Double giaBan) {
        this.idCTSP = idCTSP;
        this.tenSP = tenSP;
        this.tenNSX = tenNSX;
        this.tenMauSac = tenMauSac;
        this.tenDongSP = tenDongSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSanPham(String tenSP, String tenNSX, String tenMauSac, String tenDongSP, int namBH, String moTa, int soLuongTon, Double giaNhap, Double giaBan) {
        this.tenSP = tenSP;
        this.tenNSX = tenNSX;
        this.tenMauSac = tenMauSac;
        this.tenDongSP = tenDongSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSanPham(String idCTSP) {
        this.idCTSP = idCTSP;
    }

    public ChiTietSanPham(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getIdCTSP() {
        return idCTSP;
    }

    public void setIdCTSP(String idCTSP) {
        this.idCTSP = idCTSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public String getTenDongSP() {
        return tenDongSP;
    }

    public void setTenDongSP(String tenDongSP) {
        this.tenDongSP = tenDongSP;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Object[] toRowData() {
        return new Object[]{tenSP, tenNSX, tenMauSac, tenDongSP, namBH, moTa, soLuongTon, giaNhap, giaBan};
    }
}
