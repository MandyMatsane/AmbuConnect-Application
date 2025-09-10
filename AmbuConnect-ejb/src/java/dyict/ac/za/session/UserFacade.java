package dyict.ac.za.session;

import dyict.ac.za.entities.User;
import dyict.ac.za.session.UserFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class UserFacade extends AbstractFacade<User> implements UserFacadeLocal {

    @PersistenceContext(unitName = "AmbuConnect-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    @Override
    public User findByEmail(String email) {
        try {
            String sql = "SELECT u FROM User u WHERE u.email = :email";
            
            TypedQuery<User> query = em.createQuery(sql, User.class);
            
            query.setParameter("email", email);
            
            return query.getSingleResult();
        } catch (NoResultException e) {
            
            return null;            
        }
    }
    
}
