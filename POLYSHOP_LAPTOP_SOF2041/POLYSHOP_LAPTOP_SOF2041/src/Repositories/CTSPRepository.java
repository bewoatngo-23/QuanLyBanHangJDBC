/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

/**
 *
 * @author ADMIN
 */
import DomainModels.ChiTietSanPham;
import DomainModels.DongSanPham;
import DomainModels.MauSac;
import DomainModels.Nsx;
import DomainModels.SanPham;
import Utilities.DBContext;
import ViewModels.ChiTietSanPhamViewModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class CTSPRepository {

    public List<ChiTietSanPham> getAll() {
        String query = "Select ctsp.Id, sp.Ten,n.Ten, m.Ten, d.ten,NamBH, MoTa, SoLuongTon, GiaNhap, GiaBan from ChiTietSP ctsp\n"
                + "inner join SanPham sp on sp.Id=ctsp.IdSP\n"
                + "inner join NSX n on n.Id=ctsp.IdNsx\n"
                + "inner join MauSac m on m.Id=ctsp.IdMauSac\n"
                + "inner join DongSP d on d.Id=ctsp.IdDongSP";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ChiTietSanPham> listCTSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listCTSP.add(new ChiTietSanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getDouble(9), rs.getDouble(10)));
            }
            return listCTSP;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ChiTietSanPham getOne(String id) {
        String query = """
                       SELECT Id
                       FROM FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041.dbo.ChiTietSanPham
                       WHERE Id like ?
                       """;
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, "N" + "'" + id + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ChiTietSanPham ctsp = new ChiTietSanPham(rs.getString(1));
                return ctsp;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public String add(ChiTietSanPham ctsp) {
        String query = "INSERT INTO [dbo].[ChiTietSP]\n"
                + "        \n"
                + "            ([IdSP]\n"
                + "           ,[IdNsx]\n"
                + "           ,[IdMauSac]\n"
                + "           ,[IdDongSP]\n"
                + "           ,[NamBH]\n"
                + "           ,[MoTa]\n"
                + "           ,[SoLuongTon]\n"
                + "           ,[GiaNhap]\n"
                + "           ,[GiaBan])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ctsp.getTenSP());
            ps.setObject(2, ctsp.getTenNSX());
            ps.setObject(3, ctsp.getTenMauSac());
            ps.setObject(4, ctsp.getTenDongSP());
            ps.setObject(5, ctsp.getNamBH());
            ps.setObject(6, ctsp.getMoTa());
            ps.setObject(7, ctsp.getSoLuongTon());
            ps.setObject(8, ctsp.getGiaNhap());
            ps.setObject(9, ctsp.getGiaBan());

            if (ps.executeUpdate() > 0) {
                return "Thêm thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm thất bại";

    }

    public String update(String id, ChiTietSanPham ctsp) {
        String query = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET \n"
                + "       [IdSP] = ?\n"
                + "      ,[IdNsx] = ?\n"
                + "      ,[IdMauSac] =?\n"
                + "      ,[IdDongSP] = ?\n"
                + "      ,[NamBH] = ?\n"
                + "      ,[MoTa] = ?\n"
                + "      ,[SoLuongTon] = ?\n"
                + "      ,[GiaNhap] = ?\n"
                + "      ,[GiaBan] = ?\n"
                + " WHERE Id = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ctsp.getTenSP());
            ps.setObject(2, ctsp.getTenNSX());
            ps.setObject(3, ctsp.getTenMauSac());
            ps.setObject(4, ctsp.getTenDongSP());
            ps.setObject(5, ctsp.getNamBH());
            ps.setObject(6, ctsp.getMoTa());
            ps.setObject(7, ctsp.getSoLuongTon());
            ps.setObject(8, ctsp.getGiaNhap());
            ps.setObject(9, ctsp.getGiaBan());
            ps.setObject(10, id);

            if (ps.executeUpdate() > 0) {
                return "Sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";

    }

    public String delete(String id) {
        String query = "Delete from ChiTietSP where id like ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);

            if (ps.executeUpdate() > 0) {
                return "Xóa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Xóa thất bại";
    }

    public List<ChiTietSanPham> sortBySoLuongTon() {
        String query = "Select ctsp.Id, sp.Ten,n.Ten, m.Ten, d.ten,NamBH, MoTa, SoLuongTon, GiaNhap, GiaBan from ChiTietSP ctsp\n"
                + "inner join SanPham sp on sp.Id=ctsp.IdSP\n"
                + "inner join NSX n on n.Id=ctsp.IdNsx\n"
                + "inner join MauSac m on m.Id=ctsp.IdMauSac\n"
                + "inner join DongSP d on d.Id=ctsp.IdDongSP\n"
                + "order by SoLuongTon desc";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ChiTietSanPham> listCTSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listCTSP.add(new ChiTietSanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getDouble(9), rs.getDouble(10)));
            }
            return listCTSP;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ChiTietSanPham> sortByGiaNhap() {
        String query = "Select ctsp.Id, sp.Ten,n.Ten, m.Ten, d.ten,NamBH, MoTa, SoLuongTon, GiaNhap, GiaBan from ChiTietSP ctsp\n"
                + "inner join SanPham sp on sp.Id=ctsp.IdSP\n"
                + "inner join NSX n on n.Id=ctsp.IdNsx\n"
                + "inner join MauSac m on m.Id=ctsp.IdMauSac\n"
                + "inner join DongSP d on d.Id=ctsp.IdDongSP\n"
                + "order by GiaNhap asc";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ChiTietSanPham> listCTSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listCTSP.add(new ChiTietSanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getDouble(9), rs.getDouble(10)));
            }
            return listCTSP;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ChiTietSanPham> sortByGiaBan() {
        String query = "Select ctsp.Id, sp.Ten,n.Ten, m.Ten, d.ten,NamBH, MoTa, SoLuongTon, GiaNhap, GiaBan from ChiTietSP ctsp\n"
                + "inner join SanPham sp on sp.Id=ctsp.IdSP\n"
                + "inner join NSX n on n.Id=ctsp.IdNsx\n"
                + "inner join MauSac m on m.Id=ctsp.IdMauSac\n"
                + "inner join DongSP d on d.Id=ctsp.IdDongSP\n"
                + "order by GiaBan desc";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ChiTietSanPham> listCTSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listCTSP.add(new ChiTietSanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getDouble(9), rs.getDouble(10)));
            }
            return listCTSP;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ChiTietSanPhamViewModel> getListCTSanPhamVM() {
        String sql = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";

        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietSanPhamViewModel> listCTSPVM = new ArrayList<>();
            while (rs.next()) {
                listCTSPVM.add(new ChiTietSanPhamViewModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getDouble(8)));
            }
            return listCTSPVM;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public String updateSoLuong(int slTon, String id, ChiTietSanPham ctsp) {
        String sql = "update ChiTietSP set SoLuongTon = ? Where Id = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, slTon);
            ps.setObject(2, id);
            if (ps.executeUpdate() > 0) {
                return "Sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";

    }

    public List<ChiTietSanPhamViewModel> searchSP(String txtSP) {
        String sql = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id\n"
                + "where Ten like ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, "%" + txtSP + "%");
            ResultSet rs = ps.executeQuery();
            List<ChiTietSanPhamViewModel> listCTSPVM = new ArrayList<>();
            while (rs.next()) {
                listCTSPVM.add(new ChiTietSanPhamViewModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getDouble(8)));
            }
            return listCTSPVM;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;

    }

    public List<ChiTietSanPhamViewModel> viewHDCT(String idHD) {
        String sql = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.ChiTietSP.Id = dbo.HoaDonChiTiet.IdChiTietSP inner join           \n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id\n"
                + "				  where IdHoaDon = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, "'" + idHD + "'");
            ResultSet rs = ps.executeQuery();
            List<ChiTietSanPhamViewModel> listCTSPVM = new ArrayList<>();
            while (rs.next()) {
                listCTSPVM.add(new ChiTietSanPhamViewModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getDouble(8)));
            }
            return listCTSPVM;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;

    }

    public static void main(String[] args) {
        new CTSPRepository().getListCTSanPhamVM().forEach(s -> System.out.println(s.toString()));
    }

}
