package pe.edu.upc.postcovid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.postcovid.entities.Pregun_Encues;
import pe.edu.upc.postcovid.serviceinterfaces.IPregun_EncuesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Pregun_Encues")
public class Pregun_EncuesController {

    @Autowired
    private IPregun_EncuesService peService;

    @PostMapping
    public void registrar(@RequestBody Pregun_Encues pe){
        peService.insert(pe);
    }

    @GetMapping
    public List<Pregun_Encues> listar(){
        return peService.list();
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        peService.delete(id);
    }

    @PutMapping
    public void actulizar(@RequestBody Pregun_Encues pe){
        peService.insert(pe);
    }

    @GetMapping("/listarid/{id}")
    public Optional listarId(@PathVariable("id") Integer id){
        return peService.listarid(id);
    }




}
