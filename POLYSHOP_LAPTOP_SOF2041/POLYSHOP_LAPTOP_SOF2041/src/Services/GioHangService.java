/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.GioHang;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface GioHangService {

    List<GioHang> getAll();

    String add(GioHang gh);

    String updata(String ma, GioHang gh);

    String delete(String ma);

}
