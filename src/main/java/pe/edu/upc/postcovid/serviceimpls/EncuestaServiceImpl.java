package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.postcovid.entities.Encuesta;
import pe.edu.upc.postcovid.repositories.IencuestaRepository;
import pe.edu.upc.postcovid.serviceinterfaces.IEncuestaService;

import java.util.List;
import java.util.Optional;

@Service
public class EncuestaServiceImpl implements IEncuestaService {

    @Autowired
    private IencuestaRepository eR;

    @Override
    public void insert(Encuesta encuesta) {
        eR.save(encuesta);
    }


    @Override
    public List<Encuesta> list() {

        return eR.findAll();
    }

    @Override
    public void delete(int idEncuesta) {
        eR.deleteById(idEncuesta);
    }

    ///Buscar
    @Override
    public List<Encuesta> buscarPorAnotacion(String anotaciones) {
        return eR.buscarPorAnotaciones(anotaciones);
    }

    ///listar id
    @Override
    public Optional<Encuesta> listarid(int idEncuesta) {
        return eR.findById(idEncuesta);
    }


}
