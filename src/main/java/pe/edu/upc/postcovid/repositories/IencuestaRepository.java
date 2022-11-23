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


    @Query(value = "select * from encuesta v \n" +
            "join paciente p on v.id_paciente = p.id_paciente\n" +
            "where v.fecha_encuesta >= '20221101'\n" +
            "ORDER BY v.fecha_encuesta ASC",nativeQuery = true)
    List<Encuesta>buscarNoviembre();

    @Query(value = "select d.name_paciente, count(c.id_encuesta)\n" +
            "from Encuesta c \n" +
            "inner Join Paciente d on c.id_paciente = d.id_paciente\n" +
            "group by d.name_paciente", nativeQuery = true)
    List<String[]> cantidadEncuesta();


}
