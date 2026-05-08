package com.SPI.Backend.service;
import com.SPI.Backend.model.Postura;
import com.SPI.Backend.repository.PosturaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class PosturaService {
    private final PosturaRepository repository;

    public PosturaService(PosturaRepository repository){
        this.repository = repository;
    }

    public Postura salvar(Postura postura) {
        return repository.save(postura);
    }

    public List<Postura> listar() {
        return repository.findAll();
    }

    public Postura buscarPorId (Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Postura não encontrada"));
    }

    public Postura atualizar(Long id, Postura posturaAtualizado) {
        Postura posturaExistente = buscarPorId(id);
        posturaExistente.setAngulo(posturaAtualizado.getAngulo());
        posturaExistente.setClassificacaoRiscoErgonomico(posturaAtualizado.getClassificacaoRiscoErgonomico());
        return repository.save(posturaExistente);
    }

    public void deletar(Long id) {
        Postura postura = buscarPorId(id);
        repository.delete(postura);
    }
}
