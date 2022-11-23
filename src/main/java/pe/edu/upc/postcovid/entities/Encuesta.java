package pe.edu.upc.postcovid.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Encuesta")
public class Encuesta {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEncuesta;

    @Column(name = "fechaEncuesta")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaEncuesta;

    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;

    @Column(name = "anotaciones", length = 60, nullable = false)
    private String anotaciones;

    public Encuesta() {
        super();
    }

    public Encuesta(int idEncuesta, Paciente paciente, LocalDate fechaEncuesta, String anotaciones) {
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

    public LocalDate getFechaEncuesta() {
        return fechaEncuesta;
    }

    public void setFechaEncuesta(LocalDate fechaEncuesta) {
        this.fechaEncuesta = fechaEncuesta;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }
}
