/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.dto.VistaDto;
import com.mycompany.entity.Vista;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hernan
 */
@Local
public interface VistaFacadeLocal {

    void create(Vista vista);

    void edit(Vista vista);

    void remove(Vista vista);

    Vista find(Object id);

    List<Vista> findAll();

    List<Vista> findRange(int[] range);

    int count();
    
    public List<VistaDto> obtenerEstudiantesConStore(Integer id);

    
}
