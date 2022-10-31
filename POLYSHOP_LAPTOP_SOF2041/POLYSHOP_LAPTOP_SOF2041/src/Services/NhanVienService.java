/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NhanVienService {

    List<NhanVien> getAll();

    String add(NhanVien nv);

    String update(String ma, NhanVien nv);

    String delete(String ma);
}
