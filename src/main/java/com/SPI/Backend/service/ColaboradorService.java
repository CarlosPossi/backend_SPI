package com.SPI.Backend.service;
import com.SPI.Backend.model.Colaborador;
import com.SPI.Backend.repository.ColaboradorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ColaboradorService {
    private final ColaboradorRepository repository;

    public ColaboradorService(ColaboradorRepository repository){
        this.repository = repository;
    }

    public Colaborador salvar(Colaborador colaborador){
        return repository.save(colaborador);
    }

    public List<Colaborador> listar() {
        return repository.findAll();
    }

    public Colaborador buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Colaborador não encontrado"));
    }

    public Colaborador atualizar(Long id, Colaborador colaboradorAtualizado) {
        Colaborador colaboradorExistente = buscarPorId(id);
        colaboradorExistente.setNome(colaboradorAtualizado.getNome());
        colaboradorExistente.setIdade(colaboradorAtualizado.getIdade());
        colaboradorExistente.setCpf(colaboradorAtualizado.getCpf());
        colaboradorExistente.setDataContrato(colaboradorAtualizado.getDataContrato());
        colaboradorExistente.setAsos(colaboradorAtualizado.getAsos());
        colaboradorExistente.setNrs(colaboradorAtualizado.getNrs());
        colaboradorExistente.setSexo(colaboradorAtualizado.getSexo());
        colaboradorExistente.setPostura(colaboradorAtualizado.getPostura());
        colaboradorExistente.setSessaoTrabalho(colaboradorAtualizado.getSessaoTrabalho());
        colaboradorExistente.setRisco(colaboradorAtualizado.getRisco());
        return repository.save(colaboradorExistente);
    }

    public void deletar(Long id){
        Colaborador colaborador = buscarPorId(id);
        repository.delete(colaborador);
    }
}
