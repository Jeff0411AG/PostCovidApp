package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.Encuesta;

import java.util.List;
import java.util.Optional;

public interface IEncuestaService {

    void insert(Encuesta encuesta);

    List<Encuesta> list();

    public void delete (int idEncuesta);

    ///buscar
    List<Encuesta> buscarPorAnotacion(String anotaciones);

    ///listar id
    Optional<Encuesta> listarid(int idEncuesta);


}
