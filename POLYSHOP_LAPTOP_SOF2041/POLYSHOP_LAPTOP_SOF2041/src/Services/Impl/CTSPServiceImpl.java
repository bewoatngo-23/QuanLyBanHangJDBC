/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.ChiTietSanPham;
import Repositories.CTSPRepository;
import Services.CTSPService;
import ViewModels.ChiTietSanPhamViewModel;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CTSPServiceImpl implements CTSPService {

    private CTSPRepository ctspR = new CTSPRepository();

    @Override
    public String add(ChiTietSanPham ctsp) {
        return ctspR.add(ctsp);
    }

    @Override
    public String update(String id, ChiTietSanPham ctsp) {
        return ctspR.update(id, ctsp);
    }

    @Override
    public String delete(String id) {
        return ctspR.delete(id);
    }

    @Override
    public List<ChiTietSanPham> sortBySoLuongTon() {
        return ctspR.sortBySoLuongTon();
    }

    @Override
    public List<ChiTietSanPham> sortByGiaNhap() {
        return ctspR.sortByGiaNhap();
    }

    @Override
    public List<ChiTietSanPham> sortByGiaBan() {
        return ctspR.sortByGiaBan();
    }

    @Override
    public List<ChiTietSanPhamViewModel> getListCTSanPhamVM() {
        return ctspR.getListCTSanPhamVM();
    }

    @Override
    public List<ChiTietSanPham> getAll() {
        return ctspR.getAll();
    }

    @Override
    public ChiTietSanPham getOne(String id) {
        return ctspR.getOne(id);
    }

    @Override
    public String updateSoLuong(int slTon, String id, ChiTietSanPham ctsp) {
        return ctspR.updateSoLuong(slTon, id, ctsp);
    }

    @Override
    public List<ChiTietSanPhamViewModel> searchSP(String txtSP) {
        return ctspR.searchSP(txtSP);
    }

    @Override
    public List<ChiTietSanPhamViewModel> viewHDCT(String idHD) {
        return ctspR.searchSP(idHD);
    }

}
