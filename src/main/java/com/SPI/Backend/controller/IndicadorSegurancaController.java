package com.SPI.Backend.controller;
import com.SPI.Backend.model.IndicadorSeguranca;
import com.SPI.Backend.service.IndicadorSegurancaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/indicadoresseguranca")
@CrossOrigin

public class IndicadorSegurancaController {
    private final IndicadorSegurancaService service;

    public IndicadorSegurancaController (IndicadorSegurancaService service){
        this.service = service;
    }

    @PostMapping
    public IndicadorSeguranca criar(@RequestBody IndicadorSeguranca indicadorSeguranca){
        return service.salvar(indicadorSeguranca);
    }

    @GetMapping
    public List<IndicadorSeguranca> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public IndicadorSeguranca buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public IndicadorSeguranca atualizar(@PathVariable Long id, @RequestBody IndicadorSeguranca indicadorSeguranca){
        return service.atualizar(id, indicadorSeguranca);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
