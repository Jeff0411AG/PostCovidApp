package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.postcovid.entities.ResultadoT;
import pe.edu.upc.postcovid.entities.Tarjeta;
import pe.edu.upc.postcovid.repositories.ItarjetaRepository;
import pe.edu.upc.postcovid.serviceinterfaces.ItarjetaService;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TarjetaServiceImpl implements ItarjetaService {

    @Autowired
    private ItarjetaRepository dS;

    @Override
    @Transactional
    public boolean insert(Tarjeta tarjeta) {
        Tarjeta objTarjeta = dS.save(tarjeta);
        if (objTarjeta == null) {
            return false;
        } else {
            return true;
        }
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

    @Override
    public List<ResultadoT> buscarTarjetaCantidad() {
        List<ResultadoT> lista= new ArrayList<>();
        dS.buscarTarjetas().forEach(y->{
            ResultadoT re=new ResultadoT();
            re.setPaciente(y[0]);
            re.setCantidad(y[1]);
            lista.add(re);
        });
        return lista;
    }

    @Override
    public List<Tarjeta> findByNumberAccount(String cuentaTarjeta) {
        return dS.findByNumberAccount(cuentaTarjeta);
    }

    @Override
    public List<Tarjeta> buscarNumeroDominio() {
        return dS.buscarNumeroDominio();
    }


}