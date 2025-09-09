package dyict.ac.za.session;

import dyict.ac.za.entities.Driver;
import dyict.ac.za.session.DriverFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DriverFacade extends AbstractFacade<Driver> implements DriverFacadeLocal {

    @PersistenceContext(unitName = "AmbuConnect-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DriverFacade() {
        super(Driver.class);
    }
    
}
