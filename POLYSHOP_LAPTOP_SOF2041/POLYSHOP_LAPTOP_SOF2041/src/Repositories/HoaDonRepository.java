/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import Utilities.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonRepository {

    public List<HoaDon> getAll() {
        String query = "SELECT * from HoaDon";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ;
                listHD.add(new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6),
                        rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12)));
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public HoaDon getOne(String ma) {
        String query = """
                       SELECT Id
                       FROM FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041.dbo.HoaDon
                       WHERE Ma like ? 
                       """;
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, "N" + "'" + ma + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1));
                return hd;
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public String add(HoaDon hd) {
        String query = "INSERT INTO [dbo].[HoaDon]\n"
                + "           (\n"
                + "            [idKH]\n"
                + "           ,[idNV]\n"
                + "           ,[Ma]\n"
                + "           ,[NgayTao]\n"
                + "           ,[NgayThanhToan]\n"
                + "           ,[NgayShip]\n"
                + "           ,[NgayNhan]\n"
                + "           ,[TinhTrang]\n"
                + "           ,[TenNguoiNhan]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, hd.getIdKH());
            ps.setObject(2, hd.getIdNV());
            ps.setObject(3, hd.getMa());
            ps.setObject(4, hd.getNgayTao());
            ps.setObject(5, hd.getNgayThanhToan());
            ps.setObject(6, hd.getNgayShip());
            ps.setObject(7, hd.getNgayNhan());
            ps.setObject(8, hd.getTinhTrang());
            ps.setObject(9, hd.getTenNguoiNhan());
            ps.setObject(10, hd.getDiaChi());
            ps.setObject(11, hd.getSdt());
            if (ps.executeUpdate() > 0) {
                return "Thêm thành công";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm thất bại";
    }

    public String update(String ma, HoaDon hd) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET \n"
                + "       [idKH] = ?\n"
                + "      ,[idNV] = ?\n"
                + "      ,[NgayTao] = ?\n"
                + "      ,[NgayThanhToan] = ?\n"
                + "      ,[NgayShip] = ?\n"
                + "      ,[NgayNhan] =?\n"
                + "      ,[TinhTrang] = ?\n"
                + "      ,[TenNguoiNhan] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[Sdt] =?\n"
                + " WHERE Ma = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(11, hd.getMa());
            ps.setObject(1, hd.getIdKH());
            ps.setObject(2, hd.getIdNV());
            ps.setObject(3, hd.getNgayTao());
            ps.setObject(4, hd.getNgayThanhToan());
            ps.setObject(5, hd.getNgayShip());
            ps.setObject(6, hd.getNgayNhan());
            ps.setObject(7, hd.getTinhTrang());
            ps.setObject(8, hd.getTenNguoiNhan());
            ps.setObject(9, hd.getDiaChi());
            ps.setObject(10, hd.getSdt());

            if (ps.executeUpdate() > 0) {
                return "sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";
    }

    public String delete(String ma) {
        String query = "Delete from HoaDOn where ma = ?";
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

    public String saveHoaDon(HoaDon hd) {
        String query = "Insert into HoaDon(Ma, NgayTao, TinhTrang) values (?,?,?);";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setObject(1, hd.getMa());
            ps.setObject(2, hd.getNgayTao());
            ps.setObject(3, hd.getTinhTrang());

            if (ps.executeUpdate() > 0) {
                return "Thêm hóa đơn thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm hóa đơn thất bại";
    }

    public List<HoaDon> getListHoaDon() {
        String query = "SELECT * from HoaDon order by Ma asc";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> glistHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                HoaDon hd = new HoaDon();
                hd.setIdHD(rs.getString(1));
                hd.setMa(rs.getString(4));
                hd.setNgayTao(rs.getDate(5));
                hd.setTinhTrang(rs.getInt(9));
                glistHD.add(hd);
            }
            return glistHD;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public List<HoaDon> getListDaThanhToan() {
        String query = "select * from HoaDon where TinhTrang = 0 order by Ma asc";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> glistHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                HoaDon hd = new HoaDon();
                hd.setIdHD(rs.getString(1));
                hd.setMa(rs.getString(4));
                hd.setNgayTao(rs.getDate(5));
                hd.setTinhTrang(rs.getInt(9));
                glistHD.add(hd);
            }
            return glistHD;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public List<HoaDon> getListChuaThanhToan() {
        String query = "SELECT * from HoaDon where TinhTrang = 1 order by Ma asc";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> glistHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                HoaDon hd = new HoaDon();
                hd.setIdHD(rs.getString(1));
                hd.setMa(rs.getString(4));
                hd.setNgayTao(rs.getDate(5));
                hd.setTinhTrang(rs.getInt(9));
                glistHD.add(hd);
            }
            return glistHD;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public String updateTinhTrang(String ma) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET \n"
                + "      [TinhTrang] = 0\n"
                + " WHERE Ma = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);

            if (ps.executeUpdate() > 0) {
                return "sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";
    }

    public static void main(String[] args) {
        new HoaDonRepository().getListChuaThanhToan().forEach(s -> System.out.println(s.toString()));
    }
}
