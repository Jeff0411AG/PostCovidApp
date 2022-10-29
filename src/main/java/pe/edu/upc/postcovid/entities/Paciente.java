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

    public Paciente(int idPaciente, String namePaciente, String Birthday, String lastNamePaciente, String numberPhone, String numhistoria,
                    String Diagnostico, String Version) {
        this.idPaciente = idPaciente;
        this.namePaciente = namePaciente;
        this.lastNamePaciente = lastNamePaciente;
        this.numberPhone = numberPhone;
        this.numhistoria = numhistoria;
        this.Diagnostico = Diagnostico;
        this.Version = Version;
        this.Birthday=Birthday;
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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String Birthday() {
        return Birthday;
    }

    public void Birthday(String Birthday) {
        this.Birthday = Birthday;
    }
    public String getnumhistoria() {
        return numhistoria;
    }

    public void setnumhistoria(String numhistoria) {
        this.numhistoria = numhistoria;
    }
    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }
    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }
}