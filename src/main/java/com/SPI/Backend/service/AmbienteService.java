package com.SPI.Backend.service;
import com.SPI.Backend.model.Ambiente;
import com.SPI.Backend.repository.AmbienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class AmbienteService {
    private final AmbienteRepository repository;

    public AmbienteService(AmbienteRepository repository){
        this.repository = repository;
    }

    public Ambiente salvar(Ambiente ambiente){
        return repository.save(ambiente);
    }

    public List<Ambiente> listar(){
        return repository.findAll();
    }

    public Ambiente buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ambiente não encontrado"));
    }

    public Ambiente atualizar(Long id,Ambiente ambienteAtualizado){
        Ambiente ambienteExistente = buscarPorId(id);
        ambienteExistente.setTemperatura(ambienteAtualizado.getTemperatura());
        ambienteExistente.setRuido(ambienteAtualizado.getRuido());
        ambienteExistente.setLuminosidade(ambienteAtualizado.getLuminosidade());
        ambienteExistente.setPresencaMaquina(ambienteAtualizado.getPresencaMaquina());
        ambienteExistente.setIndicadorSeguranca(ambienteAtualizado.getIndicadorSeguranca());

        return repository.save(ambienteExistente);
    }

    public void deletar(Long id) {
        Ambiente ambiente = buscarPorId(id);
        repository.delete(ambiente);
    }
}
