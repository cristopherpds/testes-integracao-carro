package com.mycompany.testes.integracao.carro;

public class Painel {
    private String tipo;
    private String display;
    private boolean controle;
    private String marca;
    private boolean estado;  // true se o display estiver ligado, false se desligado

    public Painel(String tipo, String display, boolean controle, String marca, boolean estado) {
        this.tipo = tipo;
        this.display = display;
        this.controle = controle;
        this.marca = marca;
        this.estado = estado;
    }

    public void ligarDisplay() {
        this.estado = true;
        System.out.println("Display do painel ligado.");
    }

    public void desligarDisplay() {
        this.estado = false;
        System.out.println("Display do painel desligado.");
    }

    public void atualizarInformacoes(String info) {
        System.out.println("Informações do painel atualizadas: " + info);
    }
}
