package com.SPI.Backend.model;
import jakarta.persistence.*;

@Entity
@Table(name = "alertas")

public class Alerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;
    private String descricao;
    private boolean usoCorretoEPI;

    public Alerta() {}

    public Alerta(String titulo, String descricao, boolean usoCorretoEPI) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.usoCorretoEPI = usoCorretoEPI;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public boolean getUsoCorretoEPI() { return usoCorretoEPI; }
    public void setUsoCorretoEPI(boolean usoCorretoEPI) { this.usoCorretoEPI = usoCorretoEPI; }
}