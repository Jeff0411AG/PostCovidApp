package pe.edu.upc.postcovid.entities;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;

    @Column(name = "namePaciente", length = 20, nullable = false)
    private String namePaciente;
    @Column(name = "lastNamePaciente", length = 20, nullable = false)
    private String lastNamePaciente;
    @Column(name = "Birthday")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate Birthday;

    @Column(name = "numberPhone", length = 20, nullable = false)
    private String numberPhone;
    @Column(name = "numhistoria", length = 20, nullable = false)
    private String numhistoria;
    @Column(name = "Diagnostico", length = 20, nullable = false)
    private String Diagnostico;
    @Column(name = "Version",length = 20,nullable = false)
    private String Version;

    public Paciente() {
    }

    public Paciente(int idPaciente, String namePaciente, String lastNamePaciente, LocalDate Birthday,
                    String numberPhone, String numhistoria, String diagnostico, String version) {
        this.idPaciente = idPaciente;
        this.namePaciente = namePaciente;
        this.lastNamePaciente = lastNamePaciente;
        this.Birthday = Birthday;
        this.numberPhone = numberPhone;
        this.numhistoria = numhistoria;
        Diagnostico = diagnostico;
        Version = version;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNamePaciente() {
        return namePaciente;
    }

    public void setNamePaciente(String namePaciente) {
        this.namePaciente = namePaciente;
    }

    public String getLastNamePaciente() {
        return lastNamePaciente;
    }

    public void setLastNamePaciente(String lastNamePaciente) {
        this.lastNamePaciente = lastNamePaciente;
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNumhistoria() {
        return numhistoria;
    }

    public void setNumhistoria(String numhistoria) {
        this.numhistoria = numhistoria;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }
}
