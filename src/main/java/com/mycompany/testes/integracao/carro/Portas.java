package com.mycompany.testes.integracao.carro;

public class Portas {
    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private String estado;

    public Portas(int quantidade, String material, String cor, String tipo, String estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
    }

    public void abrir() {
        this.estado = "Aberta";
        System.out.println("Porta(s) aberta(s).");
    }

    public void fechar() {
        this.estado = "Fechada";
        System.out.println("Porta(s) fechada(s).");
    }

    public String verificarEstado() {
        return "Estado das portas: " + this.estado;
    }
}
