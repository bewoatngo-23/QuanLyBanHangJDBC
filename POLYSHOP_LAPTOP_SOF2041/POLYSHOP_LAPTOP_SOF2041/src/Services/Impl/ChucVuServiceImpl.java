/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import java.util.List;
import DomainModels.ChucVu;
import Repositories.CVRepository;
import Services.ChucVuService;

/**
 *
 * @author ADMIN
 */
public class ChucVuServiceImpl implements ChucVuService {

    private CVRepository cvr = new CVRepository();

    @Override
    public List<ChucVu> getAll() {
        return cvr.getAll();
    }

    @Override
    public String add(ChucVu cv) {
        return cvr.add(cv);
    }

    @Override
    public String update(String ma, ChucVu cv) {
        return cvr.update(ma, cv);
    }

    @Override
    public String delete(String ma) {
        return cvr.delete(ma);
    }

}
