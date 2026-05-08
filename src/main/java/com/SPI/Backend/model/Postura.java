package com.SPI.Backend.model;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "posturas")

public class Postura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private float angulo;
    private String classificacaoRiscoErgonomico;

    public Postura() {}

    public Postura (float angulo, String classificacaoRiscoErgonomico){
        this.angulo = angulo;
        this.classificacaoRiscoErgonomico = classificacaoRiscoErgonomico;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public float getAngulo() { return angulo; }
    public void setAngulo(float angulo) { this.angulo = angulo; }
    public String getClassificacaoRiscoErgonomico() { return classificacaoRiscoErgonomico; }
    public void setClassificacaoRiscoErgonomico(String classificacaoRiscoErgonomico) { this.classificacaoRiscoErgonomico = classificacaoRiscoErgonomico; }
}
