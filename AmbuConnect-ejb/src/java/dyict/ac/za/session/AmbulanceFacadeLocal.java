package dyict.ac.za.session;

import dyict.ac.za.entities.Ambulance;
import java.util.List;
import javax.ejb.Local;

@Local
public interface AmbulanceFacadeLocal {

    void create(Ambulance ambulance);

    void edit(Ambulance ambulance);

    void remove(Ambulance ambulance);

    Ambulance find(Object id);

    List<Ambulance> findAll();

    List<Ambulance> findRange(int[] range);

    int count();
    
}
