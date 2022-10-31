/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;
import DomainModels.SanPham;

/**
 *
 * @author ADMIN
 */
public interface SanPhamService {

    List<SanPham> getAll();

    String add(SanPham sp);

    String update(String ma, SanPham sp);

    String delete(String ma);

 
}
