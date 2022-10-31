/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.GioHangChiTiet;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface GHCTService {
    List<GioHangChiTiet> getAll();
    
    String add(GioHangChiTiet ghct);
}
