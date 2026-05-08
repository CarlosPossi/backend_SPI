package com.SPI.Backend.model;
import jakarta.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "sessoesdetrabalhos")

public class SessaoTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalTime inicioTrabalho;
    private LocalTime fimTrabalho;
    private List<String> tarefas;

    public SessaoTrabalho() {}

    public SessaoTrabalho(LocalTime inicioTrabalho, LocalTime fimTrabalho, List<String> tarefas){
        this.inicioTrabalho = inicioTrabalho;
        this.fimTrabalho = fimTrabalho;
        this.tarefas = tarefas;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalTime getInicioTrabalho() { return inicioTrabalho; }
    public void setInicioTrabalho(LocalTime inicioTrabalho) { this.inicioTrabalho = inicioTrabalho; }
    public LocalTime getFimTrabalho() { return fimTrabalho; }
    public void setFimTrabalho(LocalTime fimTrabalho) { this.fimTrabalho = fimTrabalho; }
    public List<String> getTarefas() { return tarefas; }
    public void setTarefas(List<String> tarefas) { this.tarefas = tarefas; }
}
