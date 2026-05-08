package com.SPI.Backend.controller;
import com.SPI.Backend.model.Ambiente;
import com.SPI.Backend.model.Risco;
import com.SPI.Backend.service.AmbienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ambientes")
@CrossOrigin

public class AmbienteController {
    private final AmbienteService service;

    public AmbienteController (AmbienteService service) {
        this.service = service;
    }

    @PostMapping
    public Ambiente criar(@RequestBody Ambiente ambiente){
        return service.salvar(ambiente);
    }

    @GetMapping
    public List<Ambiente> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Ambiente buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Ambiente atualizar(@PathVariable Long id, @RequestBody Ambiente ambiente) {
        return service.atualizar(id, ambiente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
