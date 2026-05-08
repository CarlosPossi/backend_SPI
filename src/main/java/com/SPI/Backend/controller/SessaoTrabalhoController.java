package com.SPI.Backend.controller;
import com.SPI.Backend.model.SessaoTrabalho;
import com.SPI.Backend.service.SessaoTrabalhoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/sessaodetrabalho")
@CrossOrigin

public class SessaoTrabalhoController {
    private final SessaoTrabalhoService service;

    public SessaoTrabalhoController(SessaoTrabalhoService service){
        this.service = service;
    }

    @PostMapping
    public SessaoTrabalho criar(@RequestBody SessaoTrabalho sessaoTrabalho){
        return service.salvar(sessaoTrabalho);
    }

    @GetMapping
    public List<SessaoTrabalho> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public SessaoTrabalho buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public SessaoTrabalho atualizar(@PathVariable Long id, @RequestBody SessaoTrabalho sessaoTrabalho){
        return service.atualizar(id, sessaoTrabalho);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
