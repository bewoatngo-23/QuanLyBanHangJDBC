/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioHang;
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
public class GioHangRepository {

    public List<GioHang> getAll() {
        String query = "SELECT dbo.GioHang.Id, dbo.KhachHang.Ten, dbo.NhanVien.Ten AS Expr1, dbo.GioHang.Ma, dbo.GioHang.NgayTao, dbo.GioHang.NgayThanhToan, dbo.GioHang.TenNguoiNhan, dbo.GioHang.DiaChi, dbo.GioHang.Sdt, dbo.GioHang.TinhTrang\n"
                + "FROM     dbo.GioHang INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.GioHang.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.GioHang.IdNV = dbo.NhanVien.Id";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<GioHang> listGH = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                listGH.add(new GioHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6),
                        rs.getInt(10), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
            return listGH;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public GioHang getOne(String ma) {
        String query = """
                       SELECT Id
                       FROM FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041.dbo.HoaDon
                       WHERE Ma like ? 
                       """;
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, "N" + "'" + ma + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                GioHang gh = new GioHang(rs.getString(1));
                return gh;
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public String add(GioHang gh) {
        String query = "INSERT INTO [dbo].[GioHang]\n"
                + "           (\n"
                + "           [IdKH]\n"
                + "           ,[IdNV]\n"
                + "           ,[Ma]\n"
                + "           ,[NgayTao]\n"
                + "           ,[NgayThanhToan]\n"
                + "           ,[TenNguoiNhan]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt]\n"
                + "           ,[TinhTrang])\n"
                + "     VALUES\n"
                + "          (?,?,?,?,?,?,?,?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, gh.getIdKH());
            ps.setObject(2, gh.getIdNV());
            ps.setObject(3, gh.getMa());
            ps.setObject(4, gh.getNgayTao());
            ps.setObject(5, gh.getNgayThanhToan());
            ps.setObject(9, gh.getTinhTrang());
            ps.setObject(6, gh.getTenNguoiNhan());
            ps.setObject(7, gh.getDiaChi());
            ps.setObject(8, gh.getSdt());
            if (ps.executeUpdate() > 0) {
                return "Thêm thành công";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm thất bại";
    }

    public String update(String ma, GioHang gh) {
        String query = "UPDATE [dbo].[GioHang]\n"
                + "   SET \n"
                + "       [IdKH] = ?\n"
                + "      ,[IdNV] = ?\n"
                + "      ,[NgayTao] = ?\n"
                + "      ,[NgayThanhToan] =?\n"
                + "      ,[TenNguoiNhan] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[TinhTrang] =?\n"
                + " WHERE Ma = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(9, gh.getMa());
            ps.setObject(1, gh.getIdKH());
            ps.setObject(2, gh.getIdNV());
            ps.setObject(3, gh.getNgayTao());
            ps.setObject(4, gh.getNgayThanhToan());
            ps.setObject(8, gh.getTinhTrang());
            ps.setObject(5, gh.getTenNguoiNhan());
            ps.setObject(6, gh.getDiaChi());
            ps.setObject(7, gh.getSdt());

            if (ps.executeUpdate() > 0) {
                return "sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";
    }

    public String delete(String ma) {
        String query = "Delete from GioHang where ma = ?";
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
}
