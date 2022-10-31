/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.NhanVien;
import Repositories.NhanVienRepository;
import Services.NhanVienService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienServiceImpl implements NhanVienService {

    private NhanVienRepository nvr = new NhanVienRepository();

    @Override
    public List<NhanVien> getAll() {
        return nvr.getAll();
    }

    @Override
    public String add(NhanVien nv) {
        return nvr.add(nv);
    }

    @Override
    public String update(String ma, NhanVien nv) {
        return nvr.update(ma, nv);
    }

    @Override
    public String delete(String ma) {
        return nvr.delete(ma);
    }

}
