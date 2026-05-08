package com.SPI.Backend.controller;
import com.SPI.Backend.model.Postura;
import com.SPI.Backend.model.Risco;
import com.SPI.Backend.service.PosturaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/posturas")
@CrossOrigin

public class PosturaController {
    private final PosturaService service;

    public PosturaController (PosturaService service) {
        this.service = service;
    }

    @PostMapping
    public Postura criar(@RequestBody Postura postura){
        return service.salvar(postura);
    }

    @GetMapping
    public List<Postura> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Postura buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Postura atualizar(@PathVariable Long id, @RequestBody Postura postura) {
        return service.atualizar(id, postura);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
