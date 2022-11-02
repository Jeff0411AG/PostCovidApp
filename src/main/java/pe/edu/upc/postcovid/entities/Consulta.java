package pe.edu.upc.postcovid.entities;

import javax.persistence.*;

@Entity
@Table(name = "Consulta" )
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsulta;

    @Column(name = "fechaConsulta",length = 20,nullable = false)
    private String fechaConsulta;

    //@Column(name = "namePaciente",length = 30,nullable = false)
    //private String namePaciente;

    //@Column(name = "nameMedico",length = 30,nullable = false)
    //private String nameMedico;

    @Column(name = "diagnositco",length = 70,nullable = false)
    private String diagnositco;

    @Column(name = "observacion",length = 70,nullable = false)
    private String observacion;

    /////ManyToOne
    @ManyToOne
    @JoinColumn(name = "idDoctor", nullable = false)
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "idPaciente",nullable = false)
    private Paciente paciente;
    /////////


    public Consulta() {

    }

    public Consulta(int idConsulta, String fechaConsulta, String diagnositco, String observacion, Doctor doctor, Paciente paciente) {
        this.idConsulta = idConsulta;
        this.fechaConsulta = fechaConsulta;
        this.diagnositco = diagnositco;
        this.observacion = observacion;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getDiagnositco() {
        return diagnositco;
    }

    public void setDiagnositco(String diagnositco) {
        this.diagnositco = diagnositco;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }



}
