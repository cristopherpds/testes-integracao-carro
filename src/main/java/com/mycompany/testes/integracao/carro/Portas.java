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

    
}
