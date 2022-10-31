/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;
import DomainModels.ChucVu;

/**
 *
 * @author ADMIN
 */
public interface ChucVuService {

    List<ChucVu> getAll();

    String add(ChucVu cv);

    String update(String ma, ChucVu cv);

    String delete(String ma);
}
