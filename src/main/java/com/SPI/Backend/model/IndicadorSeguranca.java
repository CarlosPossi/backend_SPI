package com.SPI.Backend.model;
import jakarta.persistence.*;


@Entity
@Table(name = "indicadoresdeseguranca")

public class IndicadorSeguranca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean usoCorretoEpi;
    private float taxaIncidente;

    public IndicadorSeguranca() {}

    public IndicadorSeguranca(boolean usoCorretoEpi, float taxaIncidente){
        this.usoCorretoEpi = usoCorretoEpi;
        this.taxaIncidente = taxaIncidente;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public boolean getUsoCorretoEpi() { return usoCorretoEpi; }
    public void setUsoCorretoEpi(boolean usoCorretoEpi) { this.usoCorretoEpi = usoCorretoEpi; }
    public float getTaxaIncidente() { return taxaIncidente; }
    public void setTaxaIncidente(float taxaIncidente) { this.taxaIncidente = taxaIncidente; }
}
