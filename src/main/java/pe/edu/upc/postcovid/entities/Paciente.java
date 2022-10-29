package pe.edu.upc.postcovid.entities;


import javax.persistence.*;

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
    @Column(name = "Birthday", length = 20, nullable = false)
    private String Birthday;
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

    public Paciente(int idPaciente, String namePaciente, String lastNamePaciente, String birthday, String numberPhone, String numhistoria, String diagnostico, String version) {
        this.idPaciente = idPaciente;
        this.namePaciente = namePaciente;
        this.lastNamePaciente = lastNamePaciente;
        Birthday = birthday;
        this.numberPhone = numberPhone;
        this.numhistoria = numhistoria;
        Diagnostico = diagnostico;
        Version = version;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setNamePaciente(String namePaciente) {
        this.namePaciente = namePaciente;
    }

    public void setLastNamePaciente(String lastNamePaciente) {
        this.lastNamePaciente = lastNamePaciente;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setNumhistoria(String numhistoria) {
        this.numhistoria = numhistoria;
    }

    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public String getNamePaciente() {
        return namePaciente;
    }

    public String getLastNamePaciente() {
        return lastNamePaciente;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getNumhistoria() {
        return numhistoria;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public String getVersion() {
        return Version;
    }
}
