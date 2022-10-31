/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.Nsx;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NsxService {

    List<Nsx> getAll();

    String add(Nsx nsx);

    String update(String ma, Nsx nsx);

    String delete(String ma);

}
