package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.postcovid.entities.Consulta;
import pe.edu.upc.postcovid.entities.Doctor;
import pe.edu.upc.postcovid.repositories.IdoctorRepository;
import pe.edu.upc.postcovid.serviceinterfaces.IdoctorService;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements IdoctorService {

    @Autowired
    private IdoctorRepository dS;

    @Override
    public void insert(Doctor doctor) {
        dS.save(doctor);
    }

    @Override
    public List<Doctor> list() {
        return dS.findAll();
    }

    @Override
    public void delete(int idDoctor) {
        dS.deleteById(idDoctor);
    }

    @Override
    public List<Doctor> search(String nameDoctor) {

        return dS.buscarNombre((nameDoctor));
    }

    ///listar id
    @Override
    public Optional<Doctor> listarid(int idDoctor) {
        return dS.findById(idDoctor);
    }
    ///

}
