package pe.edu.upc.postcovid.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Tarjeta")
public class Tarjeta {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;

    @Column(name = "metodoPayment",length = 20,nullable = false)
    private String metodoPayment;

    //@Column(name = "namePatient",length = 20,nullable = false)
    //private String namePatient;
    //@Column(name = "lastNamePatient",length = 20,nullable = false)
    //private String lastNamePatient;

    @Column(name = "numberAccount",length = 20,nullable = false)
    private String numberAccount;
    @Column(name = "dateExpiration")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate dateExpiration;
    @Column(name = "numberCvc",length = 20,nullable = false)
    private String numberCvc;

    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;


    public Tarjeta() {super();}

    public Tarjeta(int idTarjeta, String metodoPayment, String numberAccount, LocalDate dateExpiration, String numberCvc, Paciente paciente) {
        this.idTarjeta = idTarjeta;
        this.metodoPayment = metodoPayment;
        this.numberAccount = numberAccount;
        this.dateExpiration = dateExpiration;
        this.numberCvc = numberCvc;
        this.paciente = paciente;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getMetodoPayment() {
        return metodoPayment;
    }

    public void setMetodoPayment(String metodoPayment) {
        this.metodoPayment = metodoPayment;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getNumberCvc() {
        return numberCvc;
    }

    public void setNumberCvc(String numberCvc) {
        this.numberCvc = numberCvc;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}

