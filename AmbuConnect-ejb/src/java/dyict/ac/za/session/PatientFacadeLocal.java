package dyict.ac.za.session;

import dyict.ac.za.entities.Patient;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DYICT
 */
@Local
public interface PatientFacadeLocal {

    void create(Patient patient);

    void edit(Patient patient);

    void remove(Patient patient);

    Patient find(Object id);

    List<Patient> findAll();

    List<Patient> findRange(int[] range);

    int count();
    
}
