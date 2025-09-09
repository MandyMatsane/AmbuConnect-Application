package dyict.ac.za.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Paramedics")
public class Paramedic implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paramedic_id;
    
    private String name;
    private String phone_number;
    private boolean available = true;

    public int getParamedic_id() {
        return paramedic_id;
    }

    public void setParamedic_id(int paramedic_id) {
        this.paramedic_id = paramedic_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "dyict.ac.za.entities.Paramedic[ id=" + paramedic_id + " ]";
    }
    
}
