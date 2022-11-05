package pe.edu.upc.postcovid.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.postcovid.entities.Pregun_Encues;
import pe.edu.upc.postcovid.repositories.Ipregun_encuesRepository;
import pe.edu.upc.postcovid.serviceinterfaces.IPregun_EncuesService;

import java.util.List;
import java.util.Optional;

@Service
public class Pregun_EncuesServcieImpl  implements IPregun_EncuesService {

    @Autowired
    private Ipregun_encuesRepository peR;

    @Override
    public void insert(Pregun_Encues pregun_encues) {
        peR.save(pregun_encues);

    }

    @Override
    public List<Pregun_Encues> list() {
        return peR.findAll();
    }


    @Override
    public void delete(int idPregun_Encues) {
        peR.deleteById(idPregun_Encues);
    }


    ///listar id
    @Override
    public Optional<Pregun_Encues> listarid(int idPregun_Encues) {
        return peR.findById(idPregun_Encues);
    }
}
