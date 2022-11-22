package pe.edu.upc.postcovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.postcovid.entities.Consulta;

import java.util.List;


@Repository
public interface IconsultaRepository extends JpaRepository <Consulta,Integer> {

    @Query ("from Consulta c where upper(c.doctor.nameDoctor)  like %:nameMedico% or LOWER(c.doctor.nameDoctor) like %:nameMedico% OR c.doctor.nameDoctor like %:nameMedico%")
    List<Consulta> buscarNombreMedico(String nameMedico);

    ///Querrys TF
    @Query(value = "select d.name_doctor, count(p.id_paciente) from Consulta c inner Join Doctor d on c.id_doctor = d.id_doctor inner Join Paciente p on p.id_paciente=c.id_paciente group by d.name_doctor", nativeQuery = true)
    List<String[]> buscarCantidadConsulta();
    ///


}
