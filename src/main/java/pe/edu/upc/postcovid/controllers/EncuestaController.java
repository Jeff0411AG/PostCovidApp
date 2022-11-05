package pe.edu.upc.postcovid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.postcovid.entities.Encuesta;
import pe.edu.upc.postcovid.serviceinterfaces.IEncuestaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/encuesta")
public class EncuestaController {

    @Autowired
    private IEncuestaService eService;

    @PostMapping
    public void registrar(@RequestBody Encuesta e){
        eService.insert(e);
    }

    @GetMapping
    public List<Encuesta> listar(){
        return eService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eService.delete(id);
    }

    //Actualizar
    @PutMapping
    public void actualizar(@RequestBody Encuesta e){
        eService.insert(e);
    }

    ///buscar
    @PostMapping("/buscar")
    public List<Encuesta> buscar(@RequestBody Encuesta e){
        return eService.buscarPorAnotacion(e.getAnotaciones());
    }

    @GetMapping("/listarID/{id}")
    public Optional listarId(@PathVariable("id") Integer id){
        return eService.listarid(id);
    }



}
