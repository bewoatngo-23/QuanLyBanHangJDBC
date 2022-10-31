/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;
import DomainModels.CuaHang;

/**
 *
 * @author ADMIN
 */
public interface CuaHangService {

    List<CuaHang> getAll();

    String add(CuaHang ch);

    String update(String ma, CuaHang ch);

    String delete(String ma);
}
