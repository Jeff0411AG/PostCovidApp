package pe.edu.upc.postcovid.entities;


import javax.persistence.*;

@Entity
@Table(name = "Doctor")
public class Doctor {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDoctor;

    @Column(name = "nameDoctor",length = 20,nullable = false)
    private String nameDoctor;
    @Column(name = "lastNameDoctor",length = 20,nullable = false)
    private String lastNameDoctor;
    @Column(name = "numberPhone",length = 20,nullable = false)
    private String numberPhone;
    @Column(name = "emailDoctor",length = 20,nullable = false)
    private String emailDoctor;

    public Doctor() {
    }

    public Doctor(int idDoctor, String nameDoctor, String lastNameDoctor, String numberPhone, String emailDoctor) {
        this.idDoctor = idDoctor;
        this.nameDoctor = nameDoctor;
        this.lastNameDoctor = lastNameDoctor;
        this.numberPhone = numberPhone;
        this.emailDoctor = emailDoctor;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getLastNameDoctor() {
        return lastNameDoctor;
    }

    public void setLastNameDoctor(String lastNameDoctor) {
        this.lastNameDoctor = lastNameDoctor;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmailDoctor() {
        return emailDoctor;
    }

    public void setEmailDoctor(String emailDoctor) {
        this.emailDoctor = emailDoctor;
    }
}
