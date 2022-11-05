package pe.edu.upc.postcovid.entities;

import javax.persistence.*;

@Entity
@Table(name = "Pregun_Encues")
public class Pregun_Encues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregun_Encues;

    @ManyToOne
    @JoinColumn(name = "idPregunta", nullable = false)
    private Pregunta pregunta;

    @ManyToOne
    @JoinColumn(name = "idEncuesta", nullable = false)
    private Encuesta encuesta;

    public Pregun_Encues() {
    }

    public Pregun_Encues(int idPregun_Encues, Pregunta pregunta, Encuesta encuesta) {
        this.idPregun_Encues = idPregun_Encues;
        this.pregunta = pregunta;
        this.encuesta = encuesta;
    }

    public int getIdPregun_Encues() {
        return idPregun_Encues;
    }

    public void setIdPregun_Encues(int idPregun_Encues) {
        this.idPregun_Encues = idPregun_Encues;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Encuesta getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }
}
