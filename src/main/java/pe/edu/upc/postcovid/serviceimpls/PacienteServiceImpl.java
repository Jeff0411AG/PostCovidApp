package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.postcovid.entities.Paciente;
import pe.edu.upc.postcovid.repositories.IpacienteRepository;
import pe.edu.upc.postcovid.serviceinterfaces.IpacienteService;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements IpacienteService {

    @Autowired
    private IpacienteRepository pS;

    @Override
    public void insert(Paciente paciente) {
        pS.save(paciente);
    }

    @Override
    public List<Paciente> list() {
        return pS.findAll();
    }

    @Override
    public void delete(int idPaciente) {
        pS.deleteById(idPaciente);
    }

    @Override
    public List<Paciente> search(String namePaciente) {

        return pS.buscarNombre((namePaciente));
    }

    @Override
    public Optional<Paciente> listarid(int idPaciente) {
        return pS.findById(idPaciente);
    }

    @Override
    public List<Paciente> buscarmayoredad() {
        return pS.buscarmayoredad();
    }

    @Override
    public List<Paciente> segundodx() {
        return pS.segundodx();
    }


}
