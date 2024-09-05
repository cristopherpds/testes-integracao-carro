package com.mycompany.testes.integracao.carro;

public class Luzes {

    private String tipo;
    private int intensidade;
    private String cor;
    private String estado;
    private String modelo;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getIntensidade() {
        return intensidade;
    }
    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligar() {
        this.estado = "Ligado";
    }

    public void desligar() {
        this.estado = "Desligado";
    }

    public int ajustarIntensidade(int novaIntensidade){ 
        if (novaIntensidade >= 0 && novaIntensidade <= 100) {
            return this.intensidade = novaIntensidade;
        } else {
            throw new IllegalArgumentException("Intensidade deve estar entre 0 e 100");
        }
    }

}
