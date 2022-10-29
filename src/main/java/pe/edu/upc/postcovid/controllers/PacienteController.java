package pe.edu.upc.postcovid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.postcovid.entities.Paciente;
import pe.edu.upc.postcovid.serviceinterfaces.IpacienteService;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    private IpacienteService pService;

    @PostMapping
    public void registrar(@RequestBody Paciente p) {
        pService.insert(p);
    }
    @GetMapping
    public List<Paciente> listar() {
        return pService.list();
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id")Integer id){
        pService.delete(id);
    }
    @PutMapping
    public void actualizar(@RequestBody Paciente d){
        pService.insert(d);
    }
    @PostMapping("/buscar")
    public List<Paciente> buscar(@RequestBody Paciente d){
        return pService.search(d.getNamePaciente());

    }
}
