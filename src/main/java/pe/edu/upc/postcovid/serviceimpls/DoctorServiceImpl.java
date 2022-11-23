package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.postcovid.entities.CantidadConsulta;
import pe.edu.upc.postcovid.entities.CantidadDoctor;
import pe.edu.upc.postcovid.entities.Consulta;
import pe.edu.upc.postcovid.entities.Doctor;
import pe.edu.upc.postcovid.repositories.IdoctorRepository;
import pe.edu.upc.postcovid.serviceinterfaces.IdoctorService;

import java.util.ArrayList;
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


    @Override
    public Optional<Doctor> listarId(int idDoctor) {
        return dS.findById((idDoctor));
    }

    @Override
    public List<CantidadDoctor> cantidadDoctor() {

        List<CantidadDoctor> lista=new ArrayList<>();
        dS.cantidadDoctor().forEach(y->{
            CantidadDoctor cc=new CantidadDoctor();
            cc.setPaciente(y[0]);
            cc.setCantidad(y[1]);
            lista.add(cc);
        });
        return lista;
    }


}
