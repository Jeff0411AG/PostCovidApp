package pe.edu.upc.postcovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.postcovid.entities.Pregun_Encues;

@Repository
public interface Ipregun_encuesRepository extends JpaRepository <Pregun_Encues,Integer> {


}
