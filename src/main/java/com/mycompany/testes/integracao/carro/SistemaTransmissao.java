package com.mycompany.testes.integracao.carro;

public class SistemaTransmissao {
    private String tipo;
    private int numeroDeMarchas;
    private String material;
    private String marca;
    private boolean estado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void trocarMarcha(int marcha) {
        if (marcha >= 0 && marcha < numeroDeMarchas) {
            System.out.println("Marcha trocada para a marcha " + marcha);
        } else {
            System.out.println("Marcha inválida");
        }
    }

    public void desligar() {
        estado = false;
        System.out.println("Sistema de transmissao desligado");
    }

    public boolean verificarEstado() {
        return estado;
    }

    public void ligar() {
        estado = true;
        System.out.println("Sistema de transmissao ligado");
    }
    
    public void substituirComponente(String componente, String novoComponente) {
        System.out.println("Substituindo componente " + componente + " por " + novoComponente);
    }
}
