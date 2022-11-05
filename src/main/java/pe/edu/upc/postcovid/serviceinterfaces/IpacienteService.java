package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.Paciente;

import java.util.List;
import java.util.Optional;

public interface IpacienteService {

    public void insert(Paciente paciente);
    List<Paciente>list();
    public void delete(int idPaciente);
    public List<Paciente> search(String namePaciente);

    ///listar id
    Optional<Paciente> listarid(int idPaciente);


}
