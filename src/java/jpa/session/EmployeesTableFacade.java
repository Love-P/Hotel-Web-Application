/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.EmployeesTable;

/**
 *
 * @author lvp5345
 */
@Stateless
public class EmployeesTableFacade extends AbstractFacade<EmployeesTable> {

    @PersistenceContext(unitName = "HotelWebApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeesTableFacade() {
        super(EmployeesTable.class);
    }
    
}
