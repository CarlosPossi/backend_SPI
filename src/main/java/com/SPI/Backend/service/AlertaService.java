package com.SPI.Backend.service;
import com.SPI.Backend.model.Alerta;
import com.SPI.Backend.repository.AlertaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class AlertaService {
    private final AlertaRepository repository;

    public AlertaService(AlertaRepository repository){
        this.repository = repository;
    }

    public Alerta salvar(Alerta alerta){
        return repository.save(alerta);
    }

    public List<Alerta> listar(){
        return repository.findAll();
    }

    public Alerta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alerta não encontrado"));
    }

    public Alerta atualizar(Long id, Alerta alertaAtualizado){
        Alerta alertaExistente = buscarPorId(id);
        alertaExistente.setTitulo(alertaAtualizado.getTitulo());
        alertaExistente.setDescricao(alertaAtualizado.getDescricao());
        alertaExistente.setUsoCorretoEPI(alertaAtualizado.getUsoCorretoEPI());

        return repository.save(alertaExistente);
    }

    public void deletar(Long id) {
        Alerta alerta = buscarPorId(id);
        repository.delete(alerta);
    }
}