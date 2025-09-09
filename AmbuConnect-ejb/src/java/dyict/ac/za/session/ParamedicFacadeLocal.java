package dyict.ac.za.session;

import dyict.ac.za.entities.Paramedic;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ParamedicFacadeLocal {

    void create(Paramedic paramedic);

    void edit(Paramedic paramedic);

    void remove(Paramedic paramedic);

    Paramedic find(Object id);

    List<Paramedic> findAll();

    List<Paramedic> findRange(int[] range);

    int count();
    
}
