package com.SPI.Backend.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "riscos")

public class Risco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String comportamento;
    private String usoEpi;
    private List<String> historico;
    private boolean documentacaoEmDia;

    public Risco() {}

    public Risco(String comportamento, String usoEpi, List<String> historico, boolean documentacaoEmDia) {
        this.comportamento = comportamento;
        this.usoEpi = usoEpi;
        this.historico = historico;
        this.documentacaoEmDia = documentacaoEmDia;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getComportamento() { return comportamento; }
    public void setComportamento(String comportamento) { this.comportamento = comportamento; }
    public String getUsoEpi() { return usoEpi; }
    public void setUsoEpi(String usoEpi) { this.usoEpi = usoEpi; }
    public List<String> getHistorico() { return historico; }
    public void setHistorico(List<String> historico) { this.historico = historico; }
    public boolean getDocumentacaoEmDia() { return documentacaoEmDia; }
    public void setDocumentacaoEmDia(boolean documentacaoEmDia) { this.documentacaoEmDia = documentacaoEmDia; }
}
