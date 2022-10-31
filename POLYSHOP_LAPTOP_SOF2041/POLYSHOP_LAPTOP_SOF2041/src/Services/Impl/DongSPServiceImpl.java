/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.DongSanPham;
import Repositories.DongSPRepository;
import Services.DongSPService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DongSPServiceImpl implements DongSPService {

    private DongSPRepository dspR = new DongSPRepository();

    @Override
    public List<DongSanPham> getAll() {
        return dspR.getAll();
    }

    @Override
    public String add(DongSanPham dsp) {
        return dspR.add(dsp);
    }

    @Override
    public String update(String ma, DongSanPham dsp) {
        return dspR.update(ma, dsp);
    }

    @Override
    public String delete(String ma) {
        return dspR.delete(ma);
    }

}
