package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.Tarjeta;

import java.util.List;
import java.util.Optional;

public interface ItarjetaService {

    public void insert(Tarjeta tarjeta);
    List<Tarjeta>list();
    public void delete(int idTarjeta);

    ///buscar
    List<Tarjeta> buscarPorPaciente(String namePaciente);


    ///listar id
    Optional<Tarjeta> listarid(int idTarjeta);





}
