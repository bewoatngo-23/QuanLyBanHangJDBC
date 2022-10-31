/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

/**
 *
 * @author ADMIN
 */
import Utilities.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import DomainModels.ChucVu;

public class CVRepository {

    public List<ChucVu> getAll() {
        String query = "Select * from ChucVu";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ChucVu> listCV = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listCV.add(new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return listCV;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String add(ChucVu cv) {
        String query = "INSERT INTO [dbo].[ChucVu]\n"
                + "           (\n"
                + "           [Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setObject(1, cv.getMa());
            ps.setObject(2, cv.getTen());

            if (ps.executeUpdate() > 0) {
                return "Thêm thành công";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm thất bại";
    }

    public String update(String ma, ChucVu cv) {
        String query = "UPDATE [dbo].[ChucVu]\n"
                + "   SET [Ten] = ?\n"
                + "   WHERE Ma = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(2, ma);
            ps.setObject(1, cv.getTen());

            if (ps.executeUpdate() > 0) {
                return "sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";
    }

    public String delete(String ma) {
        String query = "Delete from ChucVu where ma = ?";
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
        new CVRepository().getAll().forEach(s -> System.out.println(s.toString()));
    }
}
