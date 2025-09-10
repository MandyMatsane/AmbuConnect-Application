package dyict.ac.za.entities;

import dyict.ac.za.entities.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-09-10T15:31:18")
@StaticMetamodel(Ambulance.class)
public class Ambulance_ { 

    public static volatile SingularAttribute<Ambulance, Double> currentLat;
    public static volatile SingularAttribute<Ambulance, User> driver;
    public static volatile SingularAttribute<Ambulance, String> vehicleNumber;
    public static volatile SingularAttribute<Ambulance, Integer> id;
    public static volatile SingularAttribute<Ambulance, Double> currentLng;
    public static volatile SingularAttribute<Ambulance, String> status;

}