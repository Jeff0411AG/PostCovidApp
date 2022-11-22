package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.postcovid.entities.CantidadConsulta;
import pe.edu.upc.postcovid.entities.Consulta;
import pe.edu.upc.postcovid.repositories.IconsultaRepository;
import pe.edu.upc.postcovid.serviceinterfaces.IConsultaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultaServiceImpl implements IConsultaService {

    @Autowired
    private IconsultaRepository cR;

    @Override
    public void insert(Consulta consulta) {
        cR.save(consulta);
    }

    @Override
    public List<Consulta> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idconsulta) {
        cR.deleteById(idconsulta);
    }

    @Override
    public List<Consulta> buscarPorDoctor(String nameMedico) {
        return cR.buscarNombreMedico(nameMedico);
    }


    /*@Override
    public List<Consulta> search(String nameMedico) {
        return cR.buscarNombreMedico(nameMedico);
    }*/

    ///listar id
    @Override
    public Optional<Consulta> listarid(int idConsulta) {
        return cR.findById(idConsulta);
    }


    ///Querry TF
    @Override
    public List<CantidadConsulta> BuscarCantidadConsultas() {

        List<CantidadConsulta> lista=new ArrayList<>();
        cR.buscarCantidadConsulta().forEach(y->{
            CantidadConsulta cc=new CantidadConsulta();
            cc.setDoctor(y[0]);
            cc.setCantidad(y[1]);
            lista.add(cc);
        });
        return lista;
    }
    ////






}
