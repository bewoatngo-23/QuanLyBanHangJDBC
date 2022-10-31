/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.MauSac;
import Repositories.MauSacRepository;
import Services.MauSacService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class MauSacServiceImpl implements MauSacService {

    private MauSacRepository msR = new MauSacRepository();

    @Override
    public List<MauSac> getAll() {
        return msR.getAll();
    }

    @Override
    public String add(MauSac ms) {
        return msR.add(ms);
    }

    @Override
    public String update(String ma, MauSac ms) {
        return msR.update(ma, ms);
    }

    @Override
    public String delete(String ma) {
        return msR.delete(ma);
    }
}
