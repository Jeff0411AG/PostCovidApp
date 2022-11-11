package pe.edu.upc.postcovid.entities;


import javax.persistence.*;

@Entity
@Table(name = "Pregunta")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;

    @Column(name = "descripcion", length = 75, nullable = false)
    private String descripcion;

    @Column(name = "respuesta", length = 75, nullable = false)
    private String respuesta;

    @ManyToOne
    @JoinColumn(name = "idDoctor", nullable = false)
    private Doctor doctor;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, String descripcion, String respuesta, Doctor doctor) {
        this.idPregunta = idPregunta;
        this.descripcion = descripcion;
        this.respuesta = respuesta;
        this.doctor = doctor;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
