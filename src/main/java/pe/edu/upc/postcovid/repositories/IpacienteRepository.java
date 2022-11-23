package pe.edu.upc.postcovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.postcovid.entities.Paciente;

import java.util.List;

@Repository
public interface IpacienteRepository extends JpaRepository<Paciente,Integer>{
    @Query("from Paciente  d where upper(d.namePaciente)  like %:namePaciente% or LOWER(d.namePaciente)" +
            "like %:namePaciente% OR d.namePaciente like %:namePaciente% ")

    List<Paciente> buscarNombre(@Param("namePaciente")String namePaciente);
    @Query(value = "select * from paciente p where date_part('year', CURRENT_DATE) - date_part('year', p.birthday)>18", nativeQuery = true )
    List<Paciente> buscarmayoredad();
}
