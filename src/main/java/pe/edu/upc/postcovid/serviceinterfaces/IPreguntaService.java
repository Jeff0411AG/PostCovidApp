package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.Pregunta;

import java.util.List;

public interface IPreguntaService
{
    void insrt (Pregunta pregunta);

    List<Pregunta> list();

    void delete (int idpregunta);

    List<Pregunta> search(String descripcion);


}