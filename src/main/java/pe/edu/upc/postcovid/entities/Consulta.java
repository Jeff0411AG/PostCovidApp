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

    @Column(name = "namePaciente",length = 30,nullable = false)
    private String namePaciente;

    @Column(name = "nameMedico",length = 30,nullable = false)
    private String nameMedico;

    @Column(name = "diagnositco",length = 70,nullable = false)
    private String diagnositco;

    @Column(name = "observacion",length = 70,nullable = false)
    private String observacion;

    public Consulta() {
    }

    public Consulta(int idConsulta, String fechaConsulta, String namePaciente, String nameMedico, String diagnositco, String observacion) {
        this.idConsulta = idConsulta;
        this.fechaConsulta = fechaConsulta;
        this.namePaciente = namePaciente;
        this.nameMedico = nameMedico;
        this.diagnositco = diagnositco;
        this.observacion = observacion;
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

    public String getNamePaciente() {
        return namePaciente;
    }

    public void setNamePaciente(String namePaciente) {
        this.namePaciente = namePaciente;
    }

    public String getNameMedico() {
        return nameMedico;
    }

    public void setNameMedico(String nameMedico) {
        this.nameMedico = nameMedico;
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
}
