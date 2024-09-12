package com.mycompany.testes.integracao.carro;

public class Bancos {
    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private String estado;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void ajustarEncosto(String posicao) {
        System.out.println("Encosto ajustado para a posição: " + posicao);
    }

    public void ajustarAltura(double novaAltura) {
        System.out.println("Altura ajustada para: " + novaAltura + " cm");
    }

    public void verificarEstado() {
        System.out.println("O estado atual dos bancos é: " + estado);
    }

}
