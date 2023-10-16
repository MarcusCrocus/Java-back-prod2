package producto2_065_BearsJava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="coche")
public class Coche extends Vehicles{
    private String puertas;

    public Coche(int matricula, String marca, String modelo, String puertas) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
}
