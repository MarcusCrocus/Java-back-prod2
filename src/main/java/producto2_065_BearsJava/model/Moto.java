package producto2_065_BearsJava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "moto")
public class Moto extends Vehicles{
    private String cilindraje;

    public Moto(int matricula, String marca, String modelo, String cilindraje) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    // se puede agregar métodos personalizados si es necesario
}
