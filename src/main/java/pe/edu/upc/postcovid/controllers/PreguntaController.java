package pe.edu.upc.postcovid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.postcovid.entities.Pregunta;
import pe.edu.upc.postcovid.serviceinterfaces.IPreguntaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pregunta")
public class PreguntaController {
    @Autowired
    private IPreguntaService pService;

    @PostMapping
    public void registrar(@RequestBody Pregunta p){ pService.insrt(p);}

    @GetMapping
    public List<Pregunta> listar(){
        return  pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pService.delete(id);
    }

    //Actualizar
    @PutMapping
    public void actualizar (@RequestBody Pregunta p){
        pService.insrt(p);
    }

    //buscar
    @PostMapping("/buscar")
    public List<Pregunta> buscar (@RequestBody Pregunta p){
        return pService.search(p.getDescripcion());
    }


    @GetMapping("/{id}")
    public Optional listarId(@PathVariable ("id") Integer id){
        return pService.listarid(id);
    }



}
