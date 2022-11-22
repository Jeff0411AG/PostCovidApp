package pe.edu.upc.postcovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.postcovid.entities.Pregunta;

import java.util.List;

@Repository
public interface IpreguntaRepository extends JpaRepository <Pregunta, Integer> {

    @Query("from Pregunta p where upper(p.descripcion)  like %:descripcion% or LOWER(p.descripcion) like %:descripcion% OR p.descripcion like %:descripcion%")
    List<Pregunta> buscarPorDescripcion(String descripcion);


    ///Querry TF
    ///
    @Query(value = "select d.id_doctor, d.name_doctor, d.last_name_doctor, count(d.name_doctor) from Pregunta p inner Join Doctor d on p.id_doctor = d.id_doctor group by d.id_doctor, d.name_doctor, d.last_name_doctor order by d.id_doctor", nativeQuery = true)
    List<String[]> BuscarCantidadPreguntas();
    //


}
