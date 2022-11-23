package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.CantidadConsulta;
import pe.edu.upc.postcovid.entities.Consulta;

import java.util.List;
import java.util.Optional;

public interface IConsultaService {

    public void insert (Consulta consulta);
    List<Consulta> list();


    //delete
    public void delete(int idconsulta);

    //buscar
    List<Consulta> buscarPorDoctor (String nameMedico);


    ///listar Id
    Optional<Consulta> listarid(int idConsulta);
    /////


    /////Querry TF
    List<CantidadConsulta> BuscarCantidadConsultas();
    ///
    List<Consulta> buscarConsultasNoviembre();



}
