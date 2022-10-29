package pe.edu.upc.postcovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.postcovid.entities.Tarjeta;

import java.util.List;

@Repository
public interface ItarjetaRepository extends JpaRepository<Tarjeta,Integer>{
    @Query("from Tarjeta  d where upper(d.namePatient)  like %:namePatient% or LOWER(d.namePatient)" +
            "like %:namePatient% OR d.namePatient like %:namePatient% ")

    List<Tarjeta> buscarNombre(@Param("namePatient")String namePatient);

}
