/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.GioHangChiTiet;
import Repositories.GHCTRepository;
import Services.GHCTService;
import Services.GioHangService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class GHCTServiceImpl implements GHCTService{
    private GHCTRepository ghcts = new GHCTRepository();
    @Override
    public List<GioHangChiTiet> getAll() {
        return ghcts.getAll();
    }

    @Override
    public String add(GioHangChiTiet ghct) {
        return ghcts.add(ghct);
    }
    
}
