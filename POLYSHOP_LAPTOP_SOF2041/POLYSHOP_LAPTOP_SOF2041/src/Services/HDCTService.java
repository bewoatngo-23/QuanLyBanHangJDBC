/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;
import DomainModels.HoaDonChiTiet;
import ViewModels.ChiTietHoaDonViewModel;
import ViewModels.HoaDonChiTietViewModel;

/**
 *
 * @author ADMIN
 */
public interface HDCTService {

    List<HoaDonChiTietViewModel> getAll();

    List<HoaDonChiTiet> getAllHDCT();

    String add(HoaDonChiTiet hdct);

    String update(String id, HoaDonChiTiet hdct);

    String delete(String id);

    String thanhToan(HoaDonChiTiet hdct);

    List<ChiTietHoaDonViewModel> viewHDCT(String idHD);

    String updateSoLuongGioHang(int slt, String id, String idHD, ChiTietHoaDonViewModel cthdVM);
}
