/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dyict.ac.za.session;

import dyict.ac.za.entities.Ambulance;
import dyict.ac.za.session.AmbulanceFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DYICT
 */
@Stateless
public class AmbulanceFacade extends AbstractFacade<Ambulance> implements AmbulanceFacadeLocal {

    @PersistenceContext(unitName = "AmbuConnect-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AmbulanceFacade() {
        super(Ambulance.class);
    }
    
}
