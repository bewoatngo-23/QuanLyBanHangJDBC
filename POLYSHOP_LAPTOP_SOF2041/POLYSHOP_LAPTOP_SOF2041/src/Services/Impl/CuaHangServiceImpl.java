/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import java.util.List;
import DomainModels.CuaHang;
import Repositories.CuaHangRepository;
import Services.CuaHangService;

/**
 *
 * @author ADMIN
 */
public class CuaHangServiceImpl implements CuaHangService {

    private CuaHangRepository chr = new CuaHangRepository();

    @Override
    public List<CuaHang> getAll() {
        return chr.getAll();
    }

    @Override
    public String add(CuaHang ch) {
        return chr.add(ch);
    }

    @Override
    public String update(String ma, CuaHang ch) {
        return chr.update(ma, ch);
    }

    @Override
    public String delete(String ma) {
        return chr.delete(ma);
    }
}
