/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.HoaDon;
import Repositories.HoaDonRepository;
import Services.HoaDonService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonServiceImpl implements HoaDonService {

    HoaDonRepository hdr = new HoaDonRepository();

    @Override
    public List<HoaDon> getAll() {
        return hdr.getAll();
    }

    @Override
    public String add(HoaDon hd) {
        return hdr.add(hd);
    }

    @Override
    public String updata(String ma, HoaDon hd) {
        return hdr.update(ma, hd);
    }

    @Override
    public String delete(String ma) {
        return hdr.delete(ma);
    }

    @Override
    public String saveHoaDon(HoaDon hd) {
        return hdr.saveHoaDon(hd);
    }

    @Override
    public List<HoaDon> getListHoaDon() {
        return hdr.getListHoaDon();
    }

    @Override
    public HoaDon getOne(String ma) {
        return hdr.getOne(ma);
    }

    @Override
    public List<HoaDon> getListDaThanhToan() {
        return hdr.getListDaThanhToan();
    }

    @Override
    public List<HoaDon> getListChuaThanhToan() {
        return hdr.getListChuaThanhToan();
                
    }

    @Override
    public String updateTinhTrang(String ma) {
        return hdr.updateTinhTrang(ma);
    }

   

}
