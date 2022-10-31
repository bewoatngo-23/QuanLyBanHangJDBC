/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.MauSac;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface MauSacService {

    List<MauSac> getAll();

    String add(MauSac ms);

    String update(String ma, MauSac ms);

    String delete(String ma);
}
