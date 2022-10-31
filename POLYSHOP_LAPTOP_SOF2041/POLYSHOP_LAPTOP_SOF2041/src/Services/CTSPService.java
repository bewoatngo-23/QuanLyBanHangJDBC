/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.ChiTietSanPham;
import ViewModels.ChiTietSanPhamViewModel;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface CTSPService {

    List<ChiTietSanPham> getAll();

    ChiTietSanPham getOne(String id);

    String add(ChiTietSanPham ctsp);

    String update(String id, ChiTietSanPham ctsp);

    String delete(String id);

    List<ChiTietSanPham> sortBySoLuongTon();

    List<ChiTietSanPham> sortByGiaNhap();

    List<ChiTietSanPham> sortByGiaBan();

    List<ChiTietSanPhamViewModel> getListCTSanPhamVM();

    String updateSoLuong(int slTon, String id, ChiTietSanPham ctsp);

    List<ChiTietSanPhamViewModel> searchSP(String txtSP);

    List<ChiTietSanPhamViewModel> viewHDCT(String idHD);

}
