package com.mycompany.testes.integracao.carro;

import java.util.ArrayList;

public class SistemaDirecao {
    private String tipo;
    private boolean assistido;
    private String material;
    private double relacao;
    private String marca;
    private ArrayList<String> componentes;
    
    public SistemaDirecao() {
       this.componentes = new ArrayList<>();
       // Adicionar componentes iniciais, se necessário
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean isAssistido() {
        return assistido;
    }
    public void setAssistido(boolean assistido) {
        this.assistido = assistido;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getRelacao() {
        return relacao;
    }
    public void setRelacao(double relacao) {
        this.relacao = relacao;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double ajustarDirecao(double angulo){
        return angulo * relacao;
    }

    public void verificarEstado(){

    }

    public void substituirComponente(String componente) {
        if (componentes.contains(componente)) {
            System.out.println("Substituindo o componente: " + componente);
            componentes.remove(componente);
            componentes.add(componente);
        } else {
            System.out.println("Componente não encontrado. Adicionando o componente: " + componente);
            componentes.add(componente);
        }
    }



}
