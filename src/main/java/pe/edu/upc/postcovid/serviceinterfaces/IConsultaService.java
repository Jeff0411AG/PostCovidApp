package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.Consulta;

import java.util.List;
import java.util.Optional;

public interface IConsultaService {

    public void insert (Consulta consulta);
    List<Consulta> list();


    //delete
    public void delete(int idconsulta);

    /*//buscar
    List<Consulta> search (String nameMedico);*/

    ///listar Id
    Optional<Consulta> listarid(int idConsulta);
    /////


}
