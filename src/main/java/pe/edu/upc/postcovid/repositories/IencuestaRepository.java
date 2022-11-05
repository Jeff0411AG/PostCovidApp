package pe.edu.upc.postcovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.postcovid.entities.Encuesta;

import java.util.List;

@Repository
public interface IencuestaRepository extends JpaRepository <Encuesta,Integer> {

    @Query("from Encuesta e where upper(e.anotaciones)  like %:anotaciones% or LOWER(e.anotaciones) like %:anotaciones% OR e.anotaciones like %:anotaciones%")
    List<Encuesta> buscarPorAnotaciones(String anotaciones);
}
