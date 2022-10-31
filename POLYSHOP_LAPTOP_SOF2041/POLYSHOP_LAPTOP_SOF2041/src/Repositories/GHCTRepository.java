/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioHangChiTiet;
import DomainModels.HoaDonChiTiet;
import Utilities.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class GHCTRepository {

    public List<GioHangChiTiet> getAll() {
        String query = "SELECT dbo.GioHang.Ma, dbo.ChiTietSP.id, dbo.GioHangChiTiet.SoLuong, dbo.GioHangChiTiet.DonGia, dbo.GioHangChiTiet.DonGiaKhiGiam\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.GioHangChiTiet ON dbo.ChiTietSP.Id = dbo.GioHangChiTiet.IdChiTietSP INNER JOIN\n"
                + "                  dbo.GioHang ON dbo.GioHangChiTiet.IdGioHang = dbo.GioHang.Id";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<GioHangChiTiet> listGHCT = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listGHCT.add(new GioHangChiTiet(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5)));
            }
            return listGHCT;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String add(GioHangChiTiet ghct) {
        String query = "INSERT INTO [dbo].[GioHangChiTiet]\n"
                + "           ([IdGioHang]\n"
                + "           ,[IdChiTietSP]\n"
                + "           ,[SoLuong]\n"
                + "           ,[DonGia]\n"
                + "           ,[DonGiaKhiGiam])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setObject(1, ghct.getIdGH());
            ps.setObject(2, ghct.getIdCTSP());
            ps.setObject(3, ghct.getSoLuong());
            ps.setObject(4, ghct.getDonGia());
            ps.setObject(5, ghct.getDonGiaKhiGiam());

            if (ps.executeUpdate() > 0) {
                return "Thêm thành công";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm thất bại";
    }

    public static void main(String[] args) {
        new GHCTRepository().getAll().forEach((t) -> {
            System.out.println(t.toString());
        });
    }
}
