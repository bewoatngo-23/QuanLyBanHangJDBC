/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import DomainModels.CuaHang;
import DomainModels.NhanVien;
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
public class NhanVienRepository {

    public List<NhanVien> getAll() {
        String query = "SELECT dbo.NhanVien.Id,dbo.NhanVien.Ma, dbo.NhanVien.Ten, dbo.NhanVien.TenDem, dbo.NhanVien.Ho, dbo.NhanVien.GioiTinh, dbo.NhanVien.NgaySinh, dbo.NhanVien.DiaChi, dbo.NhanVien.Sdt, dbo.CuaHang.Ten AS Expr1, dbo.ChucVu.Ten AS Expr2, \n"
                + "                  dbo.NhanVien.TrangThai\n"
                + "FROM     dbo.ChucVu INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.ChucVu.Id = dbo.NhanVien.IdCV INNER JOIN\n"
                + "                  dbo.CuaHang ON dbo.NhanVien.IdCH = dbo.CuaHang.Id";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<NhanVien> listNV = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                listNV.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9),
                        rs.getString(10), rs.getString(11), rs.getInt(12)));
            }
            return listNV;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String add(NhanVien nv) {
        String query = "INSERT INTO [dbo].[NhanVien]\n"
                + "           (\n"
                + "            [Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[TenDem]\n"
                + "           ,[Ho]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt]\n"
                + "           ,[IdCH]\n"
                + "           ,[IdCV]         \n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getTenDem());
            ps.setObject(4, nv.getHo());
            ps.setObject(5, nv.getGioiTinh());
            ps.setObject(6, nv.getNgaySinh());
            ps.setObject(7, nv.getDiaChi());
            ps.setObject(8, nv.getSdt());
            ps.setObject(9, nv.getTenCH());
            ps.setObject(10, nv.getTenCV());
            ps.setObject(11, nv.getTrangThai());

            if (ps.executeUpdate() > 0) {
                return "Thêm thành công";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm thất bại";
    }

    public String update(String ma, NhanVien nv) {
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET \n"
                + "     \n"
                + "      [Ten] = ?\n"
                + "      ,[TenDem] = ?\n"
                + "      ,[Ho] = ?\n"
                + "      ,[GioiTinh] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[IdCH] = ?\n"
                + "      ,[IdCV] = ?\n"
                + "      ,[TrangThai] = ?\n"
                + " WHERE Ma = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(11, ma);
            ps.setObject(1, nv.getTen());
            ps.setObject(2, nv.getTenDem());
            ps.setObject(3, nv.getHo());
            ps.setObject(4, nv.getGioiTinh());
            ps.setObject(5, nv.getNgaySinh());
            ps.setObject(6, nv.getDiaChi());
            ps.setObject(7, nv.getSdt());
            ps.setObject(8, nv.getTenCH());
            ps.setObject(9, nv.getTenCV());
            ps.setObject(10, nv.getTrangThai());

            if (ps.executeUpdate() > 0) {
                return "sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";
    }

    public String delete(String ma) {
        String query = "Delete from NhanVien where ma = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);

            if (ps.executeUpdate() > 0) {
                return "Xóa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Xóa thất bại";
    }

    public static void main(String[] args) {
        new NhanVienRepository().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
