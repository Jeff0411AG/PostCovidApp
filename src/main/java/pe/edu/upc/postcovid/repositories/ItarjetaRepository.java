package pe.edu.upc.postcovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.postcovid.entities.Tarjeta;

import java.util.List;

@Repository
public interface ItarjetaRepository extends JpaRepository<Tarjeta,Integer>{

    @Query("from Tarjeta t where upper(t.paciente.namePaciente) like %:namePatient% or lower(t.paciente.namePaciente) like %:namePatient% or t.paciente.namePaciente like %:namePaciente%")
    List<Tarjeta> buscarPorPaciente(String namePaciente);

}
