package pe.edu.upc.postcovid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.postcovid.entities.Encuesta;
import pe.edu.upc.postcovid.serviceinterfaces.IencuestaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Encuesta")
public class EncuestaController {
    @Autowired
    private IencuestaService eS;
    @PostMapping
    public void registrar(@RequestBody Encuesta e){
        eS.insert(e);
    }
    @PutMapping
    public void actualizar(@RequestBody Encuesta e) {
        eS.insert(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        eS.delete(id);
    }

    @GetMapping
    public List<Encuesta> listar() {
        return eS.list();
    }

    @PostMapping("/buscar")
    public List<Encuesta> buscar(@RequestBody Encuesta e) throws ParseException {

        List<Encuesta> listaEncuesta;
        listaEncuesta = eS.search(e.getAnotaciones());
        if (listaEncuesta.isEmpty()) {

            listaEncuesta = eS.search(e.getPaciente().getNamePaciente());
        }
        return listaEncuesta;

    }
    @GetMapping("/{id}")
    public Optional<Encuesta> listarId(@PathVariable("id") Integer id) {
        return eS.listarId(id);
    }



}