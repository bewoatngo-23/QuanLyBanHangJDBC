/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.KhachHang;
import Repositories.KhachHangRepository;
import Services.KhachHangService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangRepository khr = new KhachHangRepository();

    @Override
    public List<KhachHang> getAll() {
        return khr.getAll();
    }

    @Override
    public String add(KhachHang kh) {
        return khr.add(kh);
    }

    @Override
    public String update(String ma, KhachHang kh) {
        return khr.update(ma, kh);
    }

    @Override
    public String delete(String ma) {
        return khr.delete(ma);
    }

}
