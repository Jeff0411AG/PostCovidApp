package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.Paciente;

import java.util.List;

public interface IpacienteService {

    public void insert(Paciente paciente);
    List<Paciente>list();
    public void delete(int idPaciente);
    public List<Paciente> search(String namePaciente);

}
