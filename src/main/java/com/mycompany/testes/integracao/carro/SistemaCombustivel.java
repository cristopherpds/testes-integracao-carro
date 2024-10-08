package com.mycompany.testes.integracao.carro;

public class SistemaCombustivel {
    private String tipoDeCombustivel;
    private double capacidade;
    private double nivelDeCombustivel;
    private String marca;
    private boolean estado;  // true se estiver funcionando, false se não

    public SistemaCombustivel(String tipoDeCombustivel, double capacidade, double nivelDeCombustivel, String marca, boolean estado) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.capacidade = capacidade;
        this.nivelDeCombustivel = nivelDeCombustivel;
        this.marca = marca;
        this.estado = estado;
    }

    public double verificarNivel() {
        return this.nivelDeCombustivel;
    }

    public void abastecer(double quantidade) {
        this.nivelDeCombustivel += quantidade;
        System.out.println("Tanque abastecido. Nível atual: " + this.nivelDeCombustivel);
    }

    public void substituirTanque() {
        System.out.println("Tanque de combustível substituído.");
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getNivelDeCombustivel() {
        return nivelDeCombustivel;
    }

    public void setNivelDeCombustivel(double nivelDeCombustivel) {
        this.nivelDeCombustivel = nivelDeCombustivel;
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
