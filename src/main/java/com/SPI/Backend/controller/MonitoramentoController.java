package com.SPI.Backend.controller;
import com.SPI.Backend.model.Monitoramento;
import com.SPI.Backend.service.MonitoramentoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/monitoramentos")
@CrossOrigin

public class MonitoramentoController {
    private final MonitoramentoService service;

    public MonitoramentoController (MonitoramentoService service) {
        this.service = service;
    }

    @PostMapping
    public Monitoramento criar(@RequestBody Monitoramento monitoramento){
        return service.salvar(monitoramento);
    }

    @GetMapping
    public List<Monitoramento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Monitoramento buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Monitoramento atualizar(@PathVariable Long id, @RequestBody Monitoramento monitoramento) {
        return service.atualizar(id, monitoramento);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}