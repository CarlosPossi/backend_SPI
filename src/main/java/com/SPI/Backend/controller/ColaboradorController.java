package com.SPI.Backend.controller;
import com.SPI.Backend.model.Colaborador;
import com.SPI.Backend.model.SessaoTrabalho;
import com.SPI.Backend.model.Postura;
import com.SPI.Backend.service.ColaboradorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/colaboradores")
@CrossOrigin

public class ColaboradorController {
    private final ColaboradorService service;

    public ColaboradorController(ColaboradorService service){
        this.service = service;
    }

    @PostMapping
    public Colaborador criar(@RequestBody Colaborador colaborador){
        return service.salvar(colaborador);
    }

    @GetMapping
    public List<Colaborador> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Colaborador buscarPorId(@PathVariable long id){
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Colaborador atualizar(@PathVariable Long id, @RequestBody Colaborador colaborador){
        return service.atualizar(id, colaborador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
