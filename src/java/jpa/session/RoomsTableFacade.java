/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.RoomsTable;

/**
 *
 * @author lvp5345
 */
@Stateless
public class RoomsTableFacade extends AbstractFacade<RoomsTable> {

    @PersistenceContext(unitName = "HotelWebApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RoomsTableFacade() {
        super(RoomsTable.class);
    }
    
}
