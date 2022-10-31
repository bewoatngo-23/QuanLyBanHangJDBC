/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author ADMIN
 */
public class GioHangChiTiet {

    private String idGH;
    private String idCTSP;
    private int soLuong;
    private Double donGia;
    private Double donGiaKhiGiam;

    public GioHangChiTiet() {
    }

//    public Object[] toRowData() {
//        return new Object[]{idGH.getIdGH(), idCTSP.getIdCTSP(), soLuong, donGia, donGiaKhiGiam};
//    }
    public GioHangChiTiet(String idGH, String idCTSP, int soLuong, Double donGia, Double donGiaKhiGiam) {
        this.idGH = idGH;
        this.idCTSP = idCTSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.donGiaKhiGiam = donGiaKhiGiam;
    }

    public String getIdGH() {
        return idGH;
    }

    public void setIdGH(String idGH) {
        this.idGH = idGH;
    }

    public String getIdCTSP() {
        return idCTSP;
    }

    public void setIdCTSP(String idCTSP) {
        this.idCTSP = idCTSP;
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

    public Double getDonGiaKhiGiam() {
        return donGiaKhiGiam;
    }

    public void setDonGiaKhiGiam(Double donGiaKhiGiam) {
        this.donGiaKhiGiam = donGiaKhiGiam;
    }

    @Override
    public String toString() {
        return "GioHangChiTiet{" + "idGH=" + idGH + ", idCTSP=" + idCTSP + ", soLuong=" + soLuong + ", donGia=" + donGia + ", donGiaKhiGiam=" + donGiaKhiGiam + '}';
    }

    

}
