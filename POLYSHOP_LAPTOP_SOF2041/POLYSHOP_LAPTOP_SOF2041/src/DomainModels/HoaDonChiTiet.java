/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class HoaDonChiTiet {

    private String idHoaDon;
    private String idCTSanPham;
    private int soLuong;
    private Double donGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String idHoaDon, String idCTSanPham, int soLuong, Double donGia) {
        this.idHoaDon = idHoaDon;
        this.idCTSanPham = idCTSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDonChiTiet(String idCTSanPham, int soLuong, Double donGia) {
        this.idCTSanPham = idCTSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDonChiTiet(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdCTSanPham() {
        return idCTSanPham;
    }

    public void setIdCTSanPham(String idCTSanPham) {
        this.idCTSanPham = idCTSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "idHoaDon=" + idHoaDon + ", idCTSanPham=" + idCTSanPham + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

    public Object[] toRowData() {
        return new Object[]{idHoaDon, idCTSanPham, soLuong, donGia};
    }
}
