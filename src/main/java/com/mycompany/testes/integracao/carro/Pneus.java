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
}
