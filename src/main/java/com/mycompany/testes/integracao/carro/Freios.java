package com.mycompany.testes.integracao.carro;

public class Freios {
    private String tipo;
    private String material;
    private Double tamanho;
    private String marca;
    private Double nivelDeDesgaste;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Double getTamanho() {
        return tamanho;
    }
    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Double getNivelDeDesgaste() {
        return nivelDeDesgaste;
    }
    public void setNivelDeDesgaste(Double nivelDeDesgaste) {
        this.nivelDeDesgaste = nivelDeDesgaste;
    }

    
    public Double verificarDesgaste() {
        return this.nivelDeDesgaste;
    }

    public void substituirPastilhas() {
        
    }

    public void ajustarFreio(Double percentual) {
        this.nivelDeDesgaste += (percentual / 100) * this.nivelDeDesgaste;
    }
}
