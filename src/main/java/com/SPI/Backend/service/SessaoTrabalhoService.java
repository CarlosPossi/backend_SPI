package com.SPI.Backend.service;
import com.SPI.Backend.model.SessaoTrabalho;
import com.SPI.Backend.repository.SessaoTrabalhoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class SessaoTrabalhoService {
    private final SessaoTrabalhoRepository repository;

    public SessaoTrabalhoService(SessaoTrabalhoRepository repository){
        this.repository = repository;
    }

    public SessaoTrabalho salvar(SessaoTrabalho sessaoTrabalho){
        return repository.save(sessaoTrabalho);
    }

    public List<SessaoTrabalho> listar() {
        return repository.findAll();
    }

    public SessaoTrabalho buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sessão de Trabalho não encontrada"));
    }

    public SessaoTrabalho atualizar(Long id, SessaoTrabalho sessaoTrabalhoAtualizada) {
        SessaoTrabalho sessaoTrabalhoExistente = buscarPorId(id);
        sessaoTrabalhoExistente.setInicioTrabalho(sessaoTrabalhoAtualizada.getInicioTrabalho());
        sessaoTrabalhoExistente.setFimTrabalho(sessaoTrabalhoAtualizada.getFimTrabalho());
        sessaoTrabalhoExistente.setTarefas(sessaoTrabalhoAtualizada.getTarefas());
        return repository.save(sessaoTrabalhoExistente);
    }

    public void deletar(Long id){
        SessaoTrabalho sessaoTrabalho = buscarPorId(id);
        repository.delete(sessaoTrabalho);
    }
}
