/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.DongSanPham;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface DongSPService {
    
    List<DongSanPham> getAll();

    String add(DongSanPham dsp);

    String update(String ma, DongSanPham dsp);

    String delete(String ma);
}
