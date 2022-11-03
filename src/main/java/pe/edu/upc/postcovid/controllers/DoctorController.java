package pe.edu.upc.postcovid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.postcovid.entities.Doctor;
import pe.edu.upc.postcovid.serviceinterfaces.IdoctorService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private IdoctorService dService;

    @PostMapping
    public void registrar(@RequestBody Doctor d) {
        dService.insert(d);
    }
    @GetMapping
    public List<Doctor> listar() {
        return dService.list();
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dService.delete(id);
    }
    @PutMapping
    public void actualizar(@RequestBody Doctor d){
        dService.insert(d);
    }

    @PostMapping("/buscar")
    public List<Doctor> buscar(@RequestBody Doctor d){
        return dService.search(d.getNameDoctor());

    }
    @GetMapping("{id}")
    public Optional<Doctor> listarId(@PathVariable("id")Integer id){
        return dService.listarId(id);
    }
}
