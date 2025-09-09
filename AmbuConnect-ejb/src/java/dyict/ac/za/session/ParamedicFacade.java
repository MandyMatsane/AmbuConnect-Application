package dyict.ac.za.session;

import dyict.ac.za.entities.Paramedic;
import dyict.ac.za.session.ParamedicFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ParamedicFacade extends AbstractFacade<Paramedic> implements ParamedicFacadeLocal {

    @PersistenceContext(unitName = "AmbuConnect-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParamedicFacade() {
        super(Paramedic.class);
    }
    
}
