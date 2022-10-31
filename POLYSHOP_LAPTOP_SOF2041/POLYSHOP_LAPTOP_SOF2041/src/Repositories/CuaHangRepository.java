/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Utilities.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DomainModels.CuaHang;

/**
 *
 * @author ADMIN
 */
public class CuaHangRepository {

    public List<CuaHang> getAll() {
        String query = "Select * from CuaHang";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<CuaHang> listCV = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listCV.add(new CuaHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
            return listCV;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String add(CuaHang ch) {
        String query = "INSERT INTO [dbo].[CuaHang]\n"
                + "           (\n"
                + "            [Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[DiaChi]\n"
                + "           ,[ThanhPho]\n"
                + "           ,[QuocGia])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setObject(1, ch.getMa());
            ps.setObject(2, ch.getTen());
            ps.setObject(3, ch.getDiaChi());
            ps.setObject(4, ch.getThanhPho());
            ps.setObject(5, ch.getQuocGia());

            if (ps.executeUpdate() > 0) {
                return "Thêm thành công";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm thất bại";
    }

    public String update(String ma, CuaHang ch) {
        String query = "UPDATE [dbo].[CuaHang]\n"
                + "   SET \n"
                + "      [Ten] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + " WHERE Ma = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(5, ma);
            ps.setObject(1, ch.getTen());
            ps.setObject(2, ch.getDiaChi());
            ps.setObject(3, ch.getThanhPho());
            ps.setObject(4, ch.getQuocGia());

            if (ps.executeUpdate() > 0) {
                return "sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";
    }

    public String delete(String ma) {
        String query = "Delete from CuaHang where ma = ?";
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
        new CuaHangRepository().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
