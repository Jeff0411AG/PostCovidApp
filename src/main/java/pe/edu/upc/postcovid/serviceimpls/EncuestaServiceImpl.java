package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.postcovid.entities.Doctor;
import pe.edu.upc.postcovid.entities.Encuesta;
import pe.edu.upc.postcovid.entities.Paciente;
import pe.edu.upc.postcovid.repositories.IdoctorRepository;
import pe.edu.upc.postcovid.repositories.IencuestaRepository;
import pe.edu.upc.postcovid.repositories.IpacienteRepository;
import pe.edu.upc.postcovid.serviceinterfaces.IencuestaService;
import pe.edu.upc.postcovid.serviceinterfaces.IpacienteService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class EncuestaServiceImpl implements IencuestaService {
    @Autowired
    private IencuestaRepository eS;

    @Override
    @Transactional
    public boolean insert(Encuesta encuesta) {
        Encuesta objEncuesta = eS.save(encuesta);
        if (objEncuesta == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<Encuesta> list() {
        return eS.findAll();
    }

    @Override
    public void delete(int idEncuesta) {
        eS.deleteById(idEncuesta);
    }



    @Override
    public List<Encuesta> search(String anotaciones ) {

        return eS.buscarEncuesta((anotaciones));
    }

    @Override
    public Optional<Encuesta> listarId(int idEncuesta) {
        return eS.findById((idEncuesta));
    }

    @Override
    public List<Encuesta> buscarNoviembre() {
        return eS.buscarNoviembre();
    }


}
