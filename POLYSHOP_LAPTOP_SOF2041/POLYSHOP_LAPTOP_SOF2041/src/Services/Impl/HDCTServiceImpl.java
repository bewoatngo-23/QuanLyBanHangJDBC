/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import java.util.List;
import DomainModels.HoaDonChiTiet;
import Repositories.HDCTRepository;
import Repositories.HoaDonRepository;
import Services.HDCTService;
import Services.HoaDonService;
import ViewModels.ChiTietHoaDonViewModel;
import ViewModels.HoaDonChiTietViewModel;

/**
 *
 * @author ADMIN
 */
public class HDCTServiceImpl implements HDCTService {

    private HDCTRepository hdr = new HDCTRepository();

    @Override
    public List<HoaDonChiTietViewModel> getAll() {
        return hdr.getAll();
    }

    @Override
    public String add(HoaDonChiTiet hdct) {
        return hdr.add(hdct);

    }

    @Override
    public String update(String id, HoaDonChiTiet hdct) {
        return hdr.update(id, hdct);
    }

    @Override
    public String delete(String id) {
        return hdr.delete(id);
    }

    @Override
    public List<HoaDonChiTiet> getAllHDCT() {
        return hdr.getAllHDCT();
    }

    @Override
    public String thanhToan(HoaDonChiTiet hdct) {
        return hdr.thanhToan(hdct);
    }

    @Override
    public List<ChiTietHoaDonViewModel> viewHDCT(String idHD) {
        return hdr.viewHDCT(idHD);
    }

    @Override
    public String updateSoLuongGioHang(int slt, String id, String idHD, ChiTietHoaDonViewModel cthdVM) {
        return hdr.updateSoLuongGioHang(slt, id, idHD, cthdVM);
    }

}
