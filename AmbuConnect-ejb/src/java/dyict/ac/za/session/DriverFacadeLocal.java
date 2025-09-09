package dyict.ac.za.session;

import dyict.ac.za.entities.Driver;
import java.util.List;
import javax.ejb.Local;

@Local
public interface DriverFacadeLocal {

    void create(Driver driver);

    void edit(Driver driver);

    void remove(Driver driver);

    Driver find(Object id);

    List<Driver> findAll();

    List<Driver> findRange(int[] range);

    int count();
    
}
