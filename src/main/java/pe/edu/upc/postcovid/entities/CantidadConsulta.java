package pe.edu.upc.postcovid.entities;

public class CantidadConsulta {

    private String doctor;
    private String cantidad;

    public CantidadConsulta(String doctor, String cantidad) {
        this.doctor = doctor;
        this.cantidad = cantidad;
    }

    public CantidadConsulta() {
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
