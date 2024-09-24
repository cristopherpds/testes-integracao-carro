package com.mycompany.testes.integracao.carro;

public class Suspensao {
    private String tipo;
    private String material;
    private double altura;
    private int rigidez;
    private String marca;

    public Suspensao(String tipo, String material, double altura, int rigidez, String marca) {
        this.tipo = tipo;
        this.material = material;
        this.altura = altura;
        this.rigidez = rigidez;
        this.marca = marca;
    }

    public void ajustarAltura(double novaAltura) {
        this.altura = novaAltura;
        System.out.println("A altura foi ajustada para: " + this.altura);
    }

    public String verificarEstado() {
        if (this.altura < 10 || this.rigidez < 50) {
            return "Suspensão em estado precário";
        }
        return "Suspensão em bom estado";
    }

    public void substituir() {
        System.out.println("Suspensão substituída.");
    }
}
