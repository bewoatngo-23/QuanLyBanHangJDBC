/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface KhachHangService {
    List<KhachHang> getAll();
    
    String add(KhachHang kh);
    
    String update(String ma, KhachHang kh);
    
    String delete(String ma);
}
