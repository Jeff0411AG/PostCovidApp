package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.CantidadEncuesta;
import pe.edu.upc.postcovid.entities.Encuesta;

import java.util.List;
import java.util.Optional;

public interface IencuestaService {

    public boolean insert(Encuesta encuesta);
    List<Encuesta> list();
    public void delete(int idEncuesta);

    public List<Encuesta> search(String anotaciones);

    public Optional<Encuesta> listarId(int idDoctor);

    List<Encuesta> buscarNoviembre();


    List<CantidadEncuesta> cantidadEncuestas();
}
