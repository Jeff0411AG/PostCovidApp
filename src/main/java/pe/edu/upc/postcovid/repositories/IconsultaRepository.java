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
    //Querry 1 con entidad resutlado
    @Query(value = "select d.name_doctor, count(p.id_paciente) from Consulta c inner Join Doctor d on c.id_doctor = d.id_doctor inner Join Paciente p on p.id_paciente=c.id_paciente group by d.name_doctor", nativeQuery = true)
    List<String[]> buscarCantidadConsulta();

    ///
    //@Query(value = "select c.id_consulta, p.name_paciente, d.name_doctor, c.diagnositco, c.observacion, c.fecha_consulta from Consulta c inner Join Doctor d on c.id_doctor = d.id_doctor inner Join Paciente p on p.id_paciente=c.id_paciente where c.fecha_consulta >='2022-11-01' and c.fecha_consulta <= '2022-11-30' order by c.fecha_consulta",nativeQuery = true)
    //List<String[]> buscarConsultasNoviembre();

    ///Querry 2 sin entidad Resultado
    @Query(value = "select * from Consulta c inner Join Doctor d on c.id_doctor = d.id_doctor inner Join Paciente p on p.id_paciente=c.id_paciente where c.fecha_consulta >='2022-11-01' and c.fecha_consulta <= '2022-11-30' order by c.fecha_consulta",nativeQuery = true)
    List<Consulta> BuscarConsutlasNoviembre();
    ////



}
