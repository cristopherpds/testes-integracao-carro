package com.mycompany.testes.integracao.carro;

public class Luzes {

    private String tipo;
    private int intensidade;
    private String cor;
    private String estado;
    private String modelo;

    private SistemaEletrico sistemaEletrico;

    public Luzes(SistemaEletrico sistemaEletrico) {
        this.sistemaEletrico = sistemaEletrico;
        this.estado = "Desligado";
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getIntensidade() {
        return intensidade;
    }
    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligar() {
        if (sistemaEletrico.verificarBateria()) {
            this.estado = "Ligado";
            System.out.println("Luzes ligadas.");
        } else {
            System.out.println("Não é possível ligar as luzes. Sistema elétrico não está funcionando.");
        }
    }

    public void desligar() {
        if (this.estado.equals("Ligado")) {
            this.estado = "Desligado";
            System.out.println("Luzes desligadas.");
        } else {
            System.out.println("As luzes já estão desligadas.");
        }
    }

    public int ajustarIntensidade(int novaIntensidade){ 
        if (!this.estado.equals("Ligado")) {
            throw new IllegalStateException("Não é possível ajustar a intensidade. As luzes estão desligadas.");
        }
        if (novaIntensidade >= 0 && novaIntensidade <= 100) {
            this.intensidade = novaIntensidade;
            return this.intensidade;
        } else {
            throw new IllegalArgumentException("Intensidade deve estar entre 0 e 100");
        }
    }

}
