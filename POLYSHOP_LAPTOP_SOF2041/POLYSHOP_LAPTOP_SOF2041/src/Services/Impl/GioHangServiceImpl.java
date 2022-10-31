/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.GioHang;
import Repositories.GioHangRepository;
import Services.GioHangService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class GioHangServiceImpl implements GioHangService {

    GioHangRepository ghs = new GioHangRepository();

    @Override
    public List<GioHang> getAll() {
        return ghs.getAll();
    }

    @Override
    public String add(GioHang gh) {
        return ghs.add(gh);
    }

    @Override
    public String updata(String ma, GioHang gh) {
        return ghs.update(ma, gh);
    }

    @Override
    public String delete(String ma) {
        return ghs.delete(ma);
    }
}
