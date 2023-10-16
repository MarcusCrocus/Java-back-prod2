package producto2_065_BearsJava.model;

import jakarta.persistence.*;

import static jakarta.persistence.InheritanceType.JOINED;

@Entity
@Table (name = "vehiculos")
@Inheritance(strategy=JOINED)
public abstract class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "matricula")
    protected String matricula;
    @Column(name = "marca")
    protected String marca;
    @Column(name = "modelo")
    protected String modelo;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
