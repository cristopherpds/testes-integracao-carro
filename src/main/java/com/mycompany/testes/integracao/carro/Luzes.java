package com.mycompany.testes.integracao.carro;

public class Luzes {
    private String tipo;
    private int intensidade;
    private String cor;
    private boolean estado;  // true = ligado, false = desligado
    private String modelo;

    public Luzes(String tipo, int intensidade, String cor, boolean estado, String modelo) {
        this.tipo = tipo;
        this.intensidade = intensidade;
        this.cor = cor;
        this.estado = estado;
        this.modelo = modelo;
    }

    public void ligar() {
        this.estado = true;
        System.out.println("Luzes ligadas.");
    }

    public void desligar() {
        this.estado = false;
        System.out.println("Luzes desligadas.");
    }

    public void ajustarIntensidade(int novaIntensidade) {
        this.intensidade = novaIntensidade;
        System.out.println("Intensidade das luzes ajustada para: " + this.intensidade);
    }

    public boolean verificarEstado() {
        return this.estado;
    }
}

