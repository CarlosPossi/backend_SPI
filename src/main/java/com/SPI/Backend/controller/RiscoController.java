package com.SPI.Backend.controller;
import com.SPI.Backend.model.Risco;
import com.SPI.Backend.service.RiscoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/riscos")
@CrossOrigin

public class RiscoController {
    private final RiscoService service;

    public RiscoController(RiscoService service){
        this.service = service;
    }

    @PostMapping
    public Risco criar(@RequestBody Risco risco) {
        return service.salvar(risco);
    }

    @GetMapping
    public List<Risco> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Risco buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Risco atualizar(@PathVariable Long id, @RequestBody Risco risco){
        return service.atualizar(id, risco);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

}
