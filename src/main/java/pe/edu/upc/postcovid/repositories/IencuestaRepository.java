package pe.edu.upc.postcovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.postcovid.entities.Encuesta;

import java.util.Date;
import java.util.List;

public interface IencuestaRepository extends JpaRepository<Encuesta, Integer> {
    @Query("from Encuesta E where E.anotaciones like %:anotaciones%")
    List<Encuesta> buscarEncuesta(@Param("anotaciones") String anotaciones);





}