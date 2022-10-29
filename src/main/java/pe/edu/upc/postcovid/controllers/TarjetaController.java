package pe.edu.upc.postcovid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.postcovid.entities.Doctor;
import pe.edu.upc.postcovid.entities.Tarjeta;
import pe.edu.upc.postcovid.serviceinterfaces.IdoctorService;
import pe.edu.upc.postcovid.serviceinterfaces.ItarjetaService;

import java.util.List;
@RestController
@RequestMapping("/tarjeta")
public class TarjetaController {
    @Autowired
    private ItarjetaService dService;

    @PostMapping
    public void registrar(@RequestBody Tarjeta d) {
        dService.insert(d);
    }
    @GetMapping
    public List<Tarjeta> listar() {
        return dService.list();
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dService.delete(id);
    }
    @PutMapping
    public void actualizar(@RequestBody Tarjeta d){
        dService.insert(d);
    }
    @PostMapping("/buscar")
    public List<Tarjeta> buscar(@RequestBody Tarjeta d){
        return dService.search(d.getNamePatient());

    }
}
