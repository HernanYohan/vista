/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.company.bean;

import com.mycompany.interfaces.EstudianteClaseFacadeLocal;
import com.mycompany.entity.EstudianteClase;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Hernan
 */
@Stateless
public class EstudianteClaseFacade extends AbstractFacade<EstudianteClase> implements EstudianteClaseFacadeLocal {
    @PersistenceContext(unitName = "persistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudianteClaseFacade() {
        super(EstudianteClase.class);
    }
    
}
