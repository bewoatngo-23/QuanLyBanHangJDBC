/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.Nsx;
import Repositories.NsxRepository;
import Services.NsxService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NsxServiceImpl implements NsxService {

    private NsxRepository nsxR = new NsxRepository();

    @Override
    public List<Nsx> getAll() {
        return nsxR.getAll();
    }

    @Override
    public String add(Nsx nsx) {
        return nsxR.add(nsx);
    }

    @Override
    public String update(String ma, Nsx nsx) {
        return nsxR.update(ma, nsx);
    }

    @Override
    public String delete(String ma) {
        return nsxR.delete(ma);
    }

}
