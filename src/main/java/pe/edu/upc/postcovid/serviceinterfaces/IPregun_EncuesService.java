package pe.edu.upc.postcovid.serviceinterfaces;

import pe.edu.upc.postcovid.entities.Pregun_Encues;

import java.util.List;
import java.util.Optional;

public interface IPregun_EncuesService {

    void insert(Pregun_Encues pregun_encues);

    List<Pregun_Encues> list();

    public void delete (int idPregun_Encues);

    //List<Pregun_Encues> buscarPorAnotaciondePregunta(String anotaciones);

    ///listar id
    Optional<Pregun_Encues> listarid(int idPregun_Encues);

}
