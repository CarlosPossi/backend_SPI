package com.SPI.Backend.model;
import jakarta.persistence.*;

@Entity
@Table(name = "monitoramentos")

public class Monitoramento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String hora;
    private float valor;

    public Monitoramento() {}

    public Monitoramento(String hora, float valor) {
        this.hora = hora;
        this.valor = valor;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    public float getValor() { return valor; }
    public void setValor(float valor) { this.valor = valor; }
}