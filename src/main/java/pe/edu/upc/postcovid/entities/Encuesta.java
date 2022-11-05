package pe.edu.upc.postcovid.entities;

import javax.persistence.*;

@Entity
@Table(name = "Encuesta")
public class Encuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEncuesta;

    @Column(name = "fechaEncuesta", length = 20, nullable = false)
    private String fechaEncuesta;

    @Column(name = "anotaciones", length = 20, nullable = false)
    private String anotaciones;

    public Encuesta() {
    }

    public Encuesta(int idEncuesta, String fechaEncuesta, String anotaciones) {
        this.idEncuesta = idEncuesta;
        this.fechaEncuesta = fechaEncuesta;
        this.anotaciones = anotaciones;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public String getFechaEncuesta() {
        return fechaEncuesta;
    }

    public void setFechaEncuesta(String fechaEncuesta) {
        this.fechaEncuesta = fechaEncuesta;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }


}




