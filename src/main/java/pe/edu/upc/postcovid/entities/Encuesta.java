package pe.edu.upc.postcovid.entities;

import javax.persistence.*;

@Entity
@Table(name = "Encuesta")
public class Encuesta {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEncuesta;

    @Column(name = "fechaEncuesta", length = 60, nullable = false)
    private String fechaEncuesta;

    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;

    @Column(name = "anotaciones", length = 60, nullable = false)
    private String anotaciones;

    public Encuesta() {
        super();
    }

    public Encuesta(int idEncuesta, Paciente paciente, String fechaEncuesta, String anotaciones) {
        this.idEncuesta = idEncuesta;
        this.paciente = paciente;
        this.fechaEncuesta = fechaEncuesta;
        this.anotaciones = anotaciones;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
