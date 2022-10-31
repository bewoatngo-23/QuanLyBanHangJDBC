/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface HoaDonService {

    List<HoaDon> getAll();

    String add(HoaDon hd);

    String updata(String ma, HoaDon hd);

    String delete(String ma);

    String saveHoaDon(HoaDon hd);

    List<HoaDon> getListHoaDon();

    List<HoaDon> getListDaThanhToan();

    List<HoaDon> getListChuaThanhToan();

    HoaDon getOne(String ma);
    
    String updateTinhTrang(String ma);

}
