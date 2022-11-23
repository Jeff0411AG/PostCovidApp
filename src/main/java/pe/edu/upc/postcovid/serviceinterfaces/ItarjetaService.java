package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.ResultadoT;
import pe.edu.upc.postcovid.entities.Tarjeta;

import java.util.List;
import java.util.Optional;

public interface ItarjetaService {

    public boolean insert(Tarjeta tarjeta);
    List<Tarjeta>list();
    public void delete(int idTarjeta);

    ///buscar
    List<Tarjeta> buscarPorPaciente(String namePaciente);


    ///listar id
    Optional<Tarjeta> listarid(int idTarjeta);

    List<ResultadoT> buscarTarjetaCantidad();

    List<Tarjeta> findByNumberAccount(String cuentaTarjeta);

    List<Tarjeta> buscarNumeroDominio();




}