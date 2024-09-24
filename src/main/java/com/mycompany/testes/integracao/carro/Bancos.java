package com.mycompany.testes.integracao.carro;

public class Bancos {
    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private String estado;

    public Bancos(int quantidade, String material, String cor, String tipo, String estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
    }

    public void ajustarEncosto(String posicao) {
        System.out.println("Encosto ajustado para a posição: " + posicao);
    }

    public void ajustarAltura(double novaAltura) {
        System.out.println("Altura do banco ajustada para: " + novaAltura);
    }

    public String verificarEstado() {
        return "Estado dos bancos: " + this.estado;
    }
}

