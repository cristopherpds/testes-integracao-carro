package com.mycompany.testes.integracao.carro;

public class SistemaCombustivel {
    private String tipoCombustive;
    private double capacidade;
    private double nivelDeCombustivel;
    private String marca;
    private boolean estado;

    public String getTipoCombustive() {
        return tipoCombustive;
    }
    public void setTipoCombustive(String tipoCombustive) {
        this.tipoCombustive = tipoCombustive;
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

    public void verificarNivel(){
        if(nivelDeCombustivel == 0){
            System.out.println("Combustível esgotado.");
        } else if(nivelDeCombustivel < capacidade / 2){
            System.out.println("Combustível está próximo de esgotar.");
        } else {
            System.out.println("Combustível está em boas condições.");
        }
    }
    
    public void abastecer(double quantidade){
        if(nivelDeCombustivel + quantidade > capacidade){
            System.out.println("Não é possível abastecer essa quantidade. O combustível já está cheio.");
        } else {
            nivelDeCombustivel += quantidade;
            System.out.println("Combustível abastecido com sucesso. Novo nível: " + nivelDeCombustivel);
        }
    }

    public void substituirTanque(SistemaCombustivel novoTanque){
        this.capacidade = novoTanque.getCapacidade();
        this.nivelDeCombustivel = novoTanque.getNivelDeCombustivel();
        System.out.println("Tanque substituido com sucesso.");
    }
}
