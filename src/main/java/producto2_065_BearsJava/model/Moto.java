package producto2_065_BearsJava.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="mt_vehiculos")
@DiscriminatorValue("mt")
@PrimaryKeyJoinColumn(name="mt_id")
public class Moto extends Vehicles {
    @Column(name = "cc")
    protected Integer cc;

    @Column(name = "sidecar")
    protected Boolean sidecar;


    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Boolean getSidecar() {
        return sidecar;
    }

    public void setSidecar(Boolean sidecar) {
        this.sidecar = sidecar;
    }

    // se puede agregar métodos personalizados si es necesario
}
