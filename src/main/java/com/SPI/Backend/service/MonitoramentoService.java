package com.SPI.Backend.service;
import com.SPI.Backend.model.Monitoramento;
import com.SPI.Backend.repository.MonitoramentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class MonitoramentoService {
    private final MonitoramentoRepository repository;

    public MonitoramentoService(MonitoramentoRepository repository){
        this.repository = repository;
    }

    public Monitoramento salvar(Monitoramento monitoramento){
        return repository.save(monitoramento);
    }

    public List<Monitoramento> listar(){
        return repository.findAll();
    }

    public Monitoramento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Monitoramento não encontrado"));
    }

    public Monitoramento atualizar(Long id, Monitoramento monitoramentoAtualizado){
        Monitoramento monitoramentoExistente = buscarPorId(id);
        monitoramentoExistente.setHora(monitoramentoAtualizado.getHora());
        monitoramentoExistente.setValor(monitoramentoAtualizado.getValor());

        return repository.save(monitoramentoExistente);
    }

    public void deletar(Long id) {
        Monitoramento monitoramento = buscarPorId(id);
        repository.delete(monitoramento);
    }
}