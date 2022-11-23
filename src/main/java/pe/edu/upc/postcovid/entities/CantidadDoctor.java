package pe.edu.upc.postcovid.entities;

public class CantidadDoctor {

    private String paciente;
    private String cantidad;

    public CantidadDoctor() {
    }

    public CantidadDoctor(String paciente, String cantidad) {
        this.paciente = paciente;
        this.cantidad = cantidad;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
