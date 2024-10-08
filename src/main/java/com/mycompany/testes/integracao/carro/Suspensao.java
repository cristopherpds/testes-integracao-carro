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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getRigidez() {
        return rigidez;
    }

    public void setRigidez(int rigidez) {
        this.rigidez = rigidez;
    }

    
}
