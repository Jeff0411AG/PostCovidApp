package pe.edu.upc.postcovid.entities;

public class CantidadPreguntas {

    private String iddoctor;
    private String nombredoctor;
    private String apellidodoctor;
    private String cantidad;

    public CantidadPreguntas() {
    }

    public CantidadPreguntas(String iddoctor, String nombredoctor, String apellidodoctor, String cantidad) {
        this.iddoctor = iddoctor;
        this.nombredoctor = nombredoctor;
        this.apellidodoctor = apellidodoctor;
        this.cantidad = cantidad;
    }

    public String getIddoctor() {
        return iddoctor;
    }

    public void setIddoctor(String iddoctor) {
        this.iddoctor = iddoctor;
    }

    public String getNombredoctor() {
        return nombredoctor;
    }

    public void setNombredoctor(String nombredoctor) {
        this.nombredoctor = nombredoctor;
    }

    public String getApellidodoctor() {
        return apellidodoctor;
    }

    public void setApellidodoctor(String apellidodoctor) {
        this.apellidodoctor = apellidodoctor;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
