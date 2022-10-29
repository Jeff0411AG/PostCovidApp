package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.Tarjeta;

import java.util.List;

public interface ItarjetaService {

    public void insert(Tarjeta tarjeta);
    List<Tarjeta>list();
    public void delete(int idTarjeta);
    public List<Tarjeta> search(String namePatient);

}
