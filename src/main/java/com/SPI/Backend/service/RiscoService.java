package com.SPI.Backend.service;
import com.SPI.Backend.model.Risco;
import com.SPI.Backend.repository.RiscoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class RiscoService {
    private final RiscoRepository repository;

    public RiscoService(RiscoRepository repository){
        this.repository = repository;
    }

    public Risco salvar(Risco risco){
        return repository.save(risco);
    }

    public List<Risco> listar() {
        return repository.findAll();
    }

    public Risco buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Risco não encontrado"));
    }

    public Risco atualizar(Long id, Risco riscoAtualizado){
        Risco riscoExistente = buscarPorId(id);
        riscoExistente.setComportamento(riscoAtualizado.getComportamento());
        riscoExistente.setUsoEpi(riscoAtualizado.getUsoEpi());
        riscoExistente.setHistorico(riscoAtualizado.getHistorico());
        riscoExistente.setDocumentacaoEmDia(riscoAtualizado.getDocumentacaoEmDia());

        return repository.save(riscoExistente);
    }

    public void deletar(Long id) {
        Risco risco = buscarPorId(id);
        repository.delete(risco);
    }
}
