package com.SPI.Backend.model;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "ambientes")

public class Ambiente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private float temperatura;
    private float ruido;
    private float luminosidade;
    private boolean presencaMaquina;
    @ManyToOne
    @JoinColumn(name = "indicadorseguranca_id")
    private IndicadorSeguranca indicadorSeguranca;

    public Ambiente() {}

    public Ambiente(float temperatura, float ruido, float luminosidade, boolean  presencaMaquina, IndicadorSeguranca indicadorSeguranca){
        this.temperatura = temperatura;
        this.ruido = ruido;
        this.luminosidade = luminosidade;
        this.presencaMaquina = presencaMaquina;
        this.indicadorSeguranca = indicadorSeguranca;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public float getTemperatura() { return temperatura; }
    public void setTemperatura(float temperatura) { this.temperatura = temperatura; }
    public float getRuido() { return ruido; }
    public void setRuido(float ruido) { this.ruido = ruido; }
    public float getLuminosidade() { return luminosidade; }
    public void setLuminosidade(float luminosidade) { this.luminosidade = luminosidade; }
    public boolean getPresencaMaquina() { return presencaMaquina; }
    public void setPresencaMaquina(boolean presencaMaquina) { this.presencaMaquina = presencaMaquina; }
    public IndicadorSeguranca getIndicadorSeguranca() { return indicadorSeguranca; }
    public void setIndicadorSeguranca(IndicadorSeguranca indicadorSeguranca) { this.indicadorSeguranca = indicadorSeguranca; }
}
