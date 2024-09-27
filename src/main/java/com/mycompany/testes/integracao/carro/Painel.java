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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public boolean isControle() {
        return controle;
    }

    public void setControle(boolean controle) {
        this.controle = controle;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
