package com.mycompany.testes.integracao.carro;

public class SistemaTransmissao {
    private String tipo;
    private int numeroDeMarchas;
    private String material;
    private String marca;
    private boolean estado;

    public SistemaTransmissao(String tipo, int numeroDeMarchas, String material, String marca, boolean estado) {
        this.tipo = tipo;
        this.numeroDeMarchas = numeroDeMarchas;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public void trocarMarcha(int marcha) {
        if (marcha > 0 && marcha <= this.numeroDeMarchas) {
            System.out.println("Marcha trocada para: " + marcha);
        } else {
            System.out.println("Marcha inválida.");
        }
    }

    public String verificarEstado() {
        return this.estado ? "Transmissão em bom estado" : "Problema na transmissão";
    }

    public void substituirComponente(String componente) {
        System.out.println("Componente " + componente + " da transmissão substituído.");
    }
}
