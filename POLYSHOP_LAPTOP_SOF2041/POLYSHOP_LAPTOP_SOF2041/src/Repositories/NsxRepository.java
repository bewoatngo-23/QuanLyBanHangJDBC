/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.Nsx;
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
public class NsxRepository {

    public List<Nsx> getAll() {
        String query = "Select * from Nsx";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<Nsx> listNsx = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listNsx.add(new Nsx(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return listNsx;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String add(Nsx nsx) {
        String query = "INSERT INTO [dbo].[Nsx]\n"
                + "           (\n"
                + "           [Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setObject(1, nsx.getMa());
            ps.setObject(2, nsx.getTen());

            if (ps.executeUpdate() > 0) {
                return "Thêm thành công";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm thất bại";
    }

    public String update(String ma, Nsx nsx) {
        String query = "UPDATE [dbo].[Nsx]\n"
                + "   SET [Ten] = ?\n"
                + "   WHERE Ma = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(2, ma);
            ps.setObject(1, nsx.getTen());

            if (ps.executeUpdate() > 0) {
                return "sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";
    }

    public String delete(String ma) {
        String query = "Delete from Nsx where ma = ?";
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
