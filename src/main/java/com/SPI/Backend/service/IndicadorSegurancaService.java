package com.SPI.Backend.service;
import com.SPI.Backend.model.IndicadorSeguranca;
import com.SPI.Backend.repository.IndicadorSegurancaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class IndicadorSegurancaService {
    private final IndicadorSegurancaRepository repository;

    public IndicadorSegurancaService(IndicadorSegurancaRepository repository){
        this.repository = repository;
    }

    public IndicadorSeguranca salvar(IndicadorSeguranca indicadorSeguranca) {
        return repository.save(indicadorSeguranca);
    }

    public List<IndicadorSeguranca> listar() {
        return repository.findAll();
    }

    public IndicadorSeguranca buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Indicador de Segurança não encontrado"));
    }

    public IndicadorSeguranca atualizar(Long id, IndicadorSeguranca indicadorSegurancaAtualizado) {
        IndicadorSeguranca indicadorSegurancaExistente = buscarPorId(id);
        indicadorSegurancaExistente.setUsoCorretoEpi(indicadorSegurancaAtualizado.getUsoCorretoEpi());
        indicadorSegurancaExistente.setTaxaIncidente(indicadorSegurancaAtualizado.getTaxaIncidente());

        return repository.save(indicadorSegurancaExistente);
    }

    public void deletar(Long id){
        IndicadorSeguranca indicadorSeguranca = buscarPorId(id);
        repository.delete(indicadorSeguranca);
    }
}
