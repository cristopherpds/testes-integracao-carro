package com.mycompany.testes.integracao.carro;

public class Pneus {
    private String tamanho;
    private String tipo;
    private double pressao;
    private String marca;
    private String estado;

    public Pneus(String tamanho, String tipo, double pressao, String marca, String estado) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.pressao = pressao;
        this.marca = marca;
        this.estado = estado;
    }

    public double verificarPressao() {
        return this.pressao;
    }

    public void ajustarPressao(double novaPressao) {
        this.pressao = novaPressao;
        System.out.println("Pressão ajustada para: " + this.pressao);
    }

    public void substituir() {
        System.out.println("Pneu substituído.");
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
