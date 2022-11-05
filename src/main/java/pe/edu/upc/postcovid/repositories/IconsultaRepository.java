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


}
