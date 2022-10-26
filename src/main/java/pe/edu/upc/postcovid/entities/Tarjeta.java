package pe.edu.upc.postcovid.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tarjeta")
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;

    @Column(name = "metodoPayment",length = 20,nullable = false)
    private String metodoPayment;
    @Column(name = "namePatient",length = 20,nullable = false)
    private String namePatient;
    @Column(name = "lastNamePatient",length = 20,nullable = false)
    private String lastNamePatient;
    @Column(name = "numberAccount",length = 20,nullable = false)
    private String numberAccount;
    @Column(name = "dateExpiration",length = 20,nullable = false)
    private String dateExpiration;
    @Column(name = "numberCvc",length = 20,nullable = false)
    private String numberCvc;

    public Tarjeta() {
    }
    public Tarjeta(int idTarjeta, String metodoPayment, String namePatient, String lastNamePatient, String numberAccount, String dateExpiration, String numberCvc) {
        this.idTarjeta = idTarjeta;
        this.metodoPayment = metodoPayment;
        this.namePatient = namePatient;
        this.numberAccount = numberAccount;
        this.dateExpiration = dateExpiration;
        this.numberCvc = numberCvc;
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

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getLastNamePatient() {
        return lastNamePatient;
    }

    public void setLastNamePatient(String lastNamePatient) {
        this.lastNamePatient = lastNamePatient;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getNumberCvc() {
        return numberCvc;
    }

    public void setNumberCvc(String numberCvc) {
        this.numberCvc = numberCvc;
    }
}

