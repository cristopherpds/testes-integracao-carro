package com.mycompany.testes.integracao.carro;

public class Motor {
    private String tipo;
    private int potencia;
    private double cilindrada;
    private String marca;
    private boolean estado;  // true se estiver ligado, false se desligado

    public Motor(String tipo, int potencia, double cilindrada, String marca, boolean estado) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.estado = estado;
    }

    public void ligar() {
        this.estado = true;
        System.out.println("Motor ligado.");
    }

    public void desligar() {
        this.estado = false;
        System.out.println("Motor desligado.");
    }

    public String verificarEstado() {
        return this.estado ? "Motor está ligado" : "Motor está desligado";
    }
}
