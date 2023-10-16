package producto2_065_BearsJava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
@Entity
@Table(name="ch_vehiculos")
@DiscriminatorValue("ch")
@PrimaryKeyJoinColumn(name="ch_id")
public class Coche extends Vehicles {
    @Column(name = "puertas")
    protected Integer puertas;

    @Column(name = "plazas")
    protected Integer plazas;

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public Integer getPlazas() {
        return plazas;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
    }
}
