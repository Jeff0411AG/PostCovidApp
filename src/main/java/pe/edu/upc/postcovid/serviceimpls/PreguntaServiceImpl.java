package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.postcovid.entities.Pregunta;
import pe.edu.upc.postcovid.repositories.IpreguntaRepository;
import pe.edu.upc.postcovid.serviceinterfaces.IPreguntaService;

import java.util.List;

@Service
public class PreguntaServiceImpl implements IPreguntaService {

    @Autowired
    private IpreguntaRepository pR;

    @Override
    public void insrt(Pregunta pregunta) {
        pR.save(pregunta);

    }

    @Override
    public List<Pregunta> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idpregunta) {
        pR.deleteById(idpregunta);

    }

    @Override
    public List<Pregunta> search(String descripcion) {
        return pR.buscarPorDescripcion(descripcion);
    }


}
