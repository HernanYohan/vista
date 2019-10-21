/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.company.bean;

import com.mycompany.dto.VistaDto;
import com.mycompany.interfaces.VistaFacadeLocal;
import com.mycompany.entity.Vista;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

/**
 *
 * @author Hernan
 */
@Stateless
public class VistaFacade extends AbstractFacade<Vista> implements VistaFacadeLocal {
    @PersistenceContext(unitName = "persistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VistaFacade() {
        super(Vista.class);
    }

    @Override
    public List<VistaDto> obtenerEstudiantesConStore(Integer id) {
        System.out.println("si2");
    Query q = em.createNativeQuery("select c.nombre,e.nombre, ec.nota from estudiante e join estudiante_clase ec on ec.id_estudiante = e.id_estudiante join clase c on c.id_clase = ec.id_clase where c.id_clase = ?1");
        q.setParameter(1, id);
        List<Vista> listaEnt = (List<Vista>) q.getResultList();
        List<Vista> listaGeneral = new ArrayList();
        Iterator itr = listaEnt.iterator();
        while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            Vista inf = new Vista(String.valueOf(obj[0]), String.valueOf(obj[1]), Integer.parseInt(String.valueOf(obj[2])));
            listaGeneral.add(inf);
        }
        ModelMapper mp = new ModelMapper();
        Type listType = new TypeToken<List<VistaDto>>() {}.getType();
        List<VistaDto> listaDto = mp.map(listaGeneral, listType);
        return listaDto;
    }
    
    
    
}
