package pe.edu.upc.postcovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.postcovid.entities.Doctor;

import java.util.List;

@Repository
public interface IdoctorRepository extends JpaRepository<Doctor,Integer>{
    @Query("from Doctor  d where upper(d.nameDoctor)  like %:nameDoctor% or LOWER(d.nameDoctor)" +
            "like %:nameDoctor% OR d.nameDoctor like %:nameDoctor% ")
    List<Doctor> buscarNombre(String nameDoctor);

    @Query(value = "select d.name_paciente, count(c.id_encuesta)\n" +
            "from Encuesta c \n" +
            "inner Join Paciente d on c.id_paciente = d.id_paciente\n" +
            "group by d.name_paciente", nativeQuery = true)
    List<String[]> cantidadDoctor();

}
