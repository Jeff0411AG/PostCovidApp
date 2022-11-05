package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.postcovid.entities.Tarjeta;
import pe.edu.upc.postcovid.repositories.ItarjetaRepository;
import pe.edu.upc.postcovid.serviceinterfaces.ItarjetaService;

import java.util.List;
import java.util.Optional;

@Service
public class TarjetaServiceImpl implements ItarjetaService {

    @Autowired
    private ItarjetaRepository dS;

    @Override
    public void insert(Tarjeta tarjeta) {
        dS.save(tarjeta);
    }

    @Override
    public List<Tarjeta> list() {
        return dS.findAll();
    }

    @Override
    public void delete(int idTarjeta) {
        dS.deleteById(idTarjeta);
    }


    ///buscar
    @Override
    public List<Tarjeta> buscarPorPaciente(String namePaciente) {
        return dS.buscarPorPaciente(namePaciente);
    }


    ////listar id
    @Override
    public Optional<Tarjeta> listarid(int idTarjeta) {
        return dS.findById(idTarjeta);
    }


}
