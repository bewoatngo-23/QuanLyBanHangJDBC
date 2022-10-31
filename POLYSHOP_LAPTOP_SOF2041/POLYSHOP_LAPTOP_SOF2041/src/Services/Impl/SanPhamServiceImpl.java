/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import java.util.List;
import DomainModels.SanPham;
import Repositories.SanPhamRepository;
import Services.SanPhamService;

/**
 *
 * @author ADMIN
 */
public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepository spr = new SanPhamRepository();

    @Override
    public List<SanPham> getAll() {
        return spr.getAll();
    }

    @Override
    public String add(SanPham sp) {
        return spr.add(sp);
    }

    @Override
    public String update(String ma, SanPham sp) {
        return spr.update(ma, sp);
    }

    @Override
    public String delete(String ma) {
        return spr.delete(ma);
    }

    

}
