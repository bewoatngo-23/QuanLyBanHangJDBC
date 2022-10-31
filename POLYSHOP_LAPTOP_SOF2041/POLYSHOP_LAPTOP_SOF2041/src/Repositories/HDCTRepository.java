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
import DomainModels.ChiTietSanPham;
import DomainModels.HoaDon;
import DomainModels.HoaDonChiTiet;
import ViewModels.ChiTietHoaDonViewModel;
import ViewModels.HoaDonChiTietViewModel;

/**
 *
 * @author ADMIN
 */
public class HDCTRepository {

    public List<HoaDonChiTietViewModel> getAll() {
        String query = "Select sp.Ten, NgayThanhToan, TenNguoiNhan, SoLuong, DonGia, TinhTrang FROM HoaDonChiTiet hdct\n"
                + "                INNER JOIN HoaDon hd on hdct.IdHoaDon=hd.Id\n"
                + "                INNER JOIN ChiTietSP ctsp on ctsp.Id = hdct.IdChiTietSP\n"
                + "				INNER JOIN SanPham sp on ctsp.IdSP = sp.Id";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDonChiTietViewModel> listHDCTVM = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listHDCTVM.add(new HoaDonChiTietViewModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
            }
            return listHDCTVM;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<HoaDonChiTiet> getAllHDCT() {
        String query = "SELECT dbo.HoaDon.Ma, dbo.ChiTietSP.Id, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.ChiTietSP.Id = dbo.HoaDonChiTiet.IdChiTietSP INNER JOIN\n"
                + "                  dbo.HoaDon ON dbo.HoaDonChiTiet.IdHoaDon = dbo.HoaDon.Id";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDonChiTiet> listHDCT = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                listHDCT.add(new HoaDonChiTiet(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4)));
            }
            return listHDCT;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String add(HoaDonChiTiet hdct) {
        String query = "INSERT INTO [dbo].[HoaDonChiTiet]\n"
                + "           ([IdHoaDon]\n"
                + "           ,[IdChiTietSP]\n"
                + "           ,[SoLuong]\n"
                + "           ,[DonGia])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setObject(1, hdct.getIdHoaDon());
            ps.setObject(2, hdct.getIdCTSanPham());
            ps.setObject(3, hdct.getSoLuong());
            ps.setObject(4, hdct.getDonGia());

            if (ps.executeUpdate() > 0) {
                return "Thêm thành công";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thêm thất bại";
    }

    public String update(String id, HoaDonChiTiet hdct) {
        String query = "UPDATE [dbo].[HoaDonChiTiet]\n"
                + "   SET \n"
                + "       [SoLuong] = ?\n"
                + "      ,[DonGia] = ?\n"
                + " WHERE [IdChiTietSP] like ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(3, "'" + id + "'");
            ps.setObject(1, hdct.getSoLuong());
            ps.setObject(2, hdct.getDonGia());

            if (ps.executeUpdate() > 0) {
                return "sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";
    }

    public String delete(String id) {
        String query = "Delete from HoaDonChiTiet where IdChiTietSP like ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, "'" + id + "'");

            if (ps.executeUpdate() > 0) {
                return "Xóa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Xóa thất bại";
    }

    public String thanhToan(HoaDonChiTiet hdct) {
        String query = "INSERT INTO [dbo].[HoaDonChiTiet]\n"
                + "           ([IdHoaDon]\n"
                + "           ,[IdChiTietSP]\n"
                + "           ,[SoLuong]\n"
                + "           ,[DonGia])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setObject(1, hdct.getIdHoaDon());
            ps.setObject(2, hdct.getIdCTSanPham());
            ps.setObject(3, hdct.getSoLuong());
            ps.setObject(4, hdct.getDonGia());

            if (ps.executeUpdate() > 0) {
                return "Thanh toán thành công";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Thanh toán thất bại";
    }

    public List<ChiTietHoaDonViewModel> viewHDCT(String idHD) {
        String sql = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ma, dbo.SanPham.Ten,dbo.HoaDonChiTiet.SoLuong, dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.ChiTietSP.Id = dbo.HoaDonChiTiet.IdChiTietSP inner join           \n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id\n"
                + "				  where IdHoaDon like ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setObject(1, "'" + idHD + "'");
            ps.setObject(1, idHD);
            ResultSet rs = ps.executeQuery();
            List<ChiTietHoaDonViewModel> listCTHDVM = new ArrayList<>();
            while (rs.next()) {
                listCTHDVM.add(new ChiTietHoaDonViewModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5)));
            }
            return listCTHDVM;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;

    }

    public List<ChiTietHoaDonViewModel> viewHDCTt() {
        String sql = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ma, dbo.SanPham.Ten,dbo.HoaDonChiTiet.SoLuong, dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.ChiTietSP.Id = dbo.HoaDonChiTiet.IdChiTietSP inner join           \n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id\n"
                + "				  where IdHoaDon like ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
//           ps.setObject(1, "'" + idHD + "'");
//            ps.setObject(1, "ADB3D240-0FF8-4FC5-91E8-EDE0F4F06772");

            ResultSet rs = ps.executeQuery();
            List<ChiTietHoaDonViewModel> listCTHDVM = new ArrayList<>();
            while (rs.next()) {
                listCTHDVM.add(new ChiTietHoaDonViewModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5)));
            }
            return listCTHDVM;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;

    }

    public String updateSoLuongGioHang(int slt, String id, String idHD, ChiTietHoaDonViewModel cthdVM) {
        String sql = "update HoaDonChiTiet set SoLuong =SoLuong + ? Where IdChiTietSP = ? and IdHoaDon = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, slt);
            ps.setObject(2, id);
            ps.setObject(3, idHD);
            if (ps.executeUpdate() > 0) {
                return "Sửa thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Sửa thất bại";

    }

    public static void main(String[] args) {
        new HDCTRepository().viewHDCTt().forEach(s -> System.out.println(s.toString()));

    }

}
