package pe.edu.upc.postcovid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.postcovid.entities.Consulta;
import pe.edu.upc.postcovid.serviceinterfaces.IConsultaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private IConsultaService cService;

    @PostMapping
    public void registrar(@RequestBody Consulta c){
        cService.insert(c);
    }

    @GetMapping
    public List<Consulta> listar(){
        return cService.list();
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){

        cService.delete(id);
    }

    //Actualizar
    @PutMapping
    public void actualizar (@RequestBody Consulta c){
        cService.insert(c);
    }

    //Buscar

    @PostMapping("/buscar")
    public List<Consulta> buscar(@RequestBody Consulta c){
        return cService.buscarPorDoctor(c.getDoctor().getNameDoctor());
    }

    ///listar id
    @GetMapping("/listarid/{id}")
    public Optional listarId(@PathVariable("id")Integer id ){
        return cService.listarid(id);
    }


}
