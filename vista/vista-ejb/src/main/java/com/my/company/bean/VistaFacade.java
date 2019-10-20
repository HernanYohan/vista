/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.company.bean;

import com.mycompany.interfaces.VistaFacadeLocal;
import com.mycompany.entity.Vista;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    
}
