package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.CantidadPreguntas;
import pe.edu.upc.postcovid.entities.Pregunta;

import java.util.List;
import java.util.Optional;

public interface IPreguntaService
{
    void insrt (Pregunta pregunta);

    List<Pregunta> list();

    void delete (int idpregunta);

    List<Pregunta> search(String descripcion);

    ///listar id
    Optional<Pregunta> listarid(int idPregunta);

    ///QuerryTF
    List<CantidadPreguntas> buscarcantidadpregunta();
    ///


}
