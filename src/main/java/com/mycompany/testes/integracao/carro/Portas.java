package com.mycompany.testes.integracao.carro;

public class Portas {

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

    
    public String abrir() {
        System.out.println("Porta aberta");
        return estado = "aberta";
    }
    
  
    public String fechar() {
        System.out.println("Porta fechada");
        return estado = "fechada";
    }

    public boolean isPortaAberta() {
        return estado.equalsIgnoreCase("aberta");
    }
}
