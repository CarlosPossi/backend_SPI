package com.SPI.Backend.model;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "colaborador")

public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String nome;
    private int idade;
    private String cpf;
    private LocalDate dataContrato;
    private List<String> nrs;
    private List<String> asos;
    private String sexo;
    @ManyToOne
    @JoinColumn(name = "postura_id")
    private Postura postura;
    @ManyToOne
    @JoinColumn(name = "sessaotrabalho_id")
    private SessaoTrabalho sessaoTrabalho;
    @ManyToOne
    @JoinColumn(name = "risco_id")
    private Risco risco;

    public Colaborador() {}

    public Colaborador(String nome, int idade, String cpf, LocalDate dataContrato, List<String> nrs, List<String> asos, String sexo, Postura postura, SessaoTrabalho sessaoTrabalho, Risco risco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dataContrato = dataContrato;
        this.nrs = nrs;
        this.asos = asos;
        this.sexo = sexo;
        this.postura = postura;
        this.sessaoTrabalho = sessaoTrabalho;
        this.risco = risco;
    }

    public Long getId() { return Id; }
    public void setId(Long id) { Id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public LocalDate getDataContrato() { return dataContrato; }
    public void setDataContrato(LocalDate dataContrato) { this.dataContrato = dataContrato; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public List<String> getNrs() { return nrs; }
    public void setNrs(List<String> nrs) { this.nrs = nrs; }
    public List<String> getAsos() { return asos; }
    public void setAsos(List<String> asos) { this.asos = asos; }
    public String getSexo() { return sexo;}
    public void setSexo(String sexo) { this.sexo = sexo; }
    public Postura getPostura() { return postura; }
    public void setPostura(Postura postura) { this.postura = postura; }
    public SessaoTrabalho getSessaoTrabalho() { return sessaoTrabalho; }
    public void setSessaoTrabalho(SessaoTrabalho sessaoTrabalho) { this.sessaoTrabalho = sessaoTrabalho; }
    public Risco getRisco() { return risco; }
    public void setRisco(Risco risco) { this.risco = risco; }
}
