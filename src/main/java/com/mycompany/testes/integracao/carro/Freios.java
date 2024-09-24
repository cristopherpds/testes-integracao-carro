package com.mycompany.testes.integracao.carro;

public class Freios {
    private String tipo;
    private String material;
    private double tamanho;
    private String marca;
    private double nivelDeDesgaste;

    public Freios(String tipo, String material, double tamanho, String marca, double nivelDeDesgaste) {
        this.tipo = tipo;
        this.material = material;
        this.tamanho = tamanho;
        this.marca = marca;
        this.nivelDeDesgaste = nivelDeDesgaste;
    }

    public double verificarDesgaste() {
        return nivelDeDesgaste;  // Retorna o nível de desgaste
    }

    public void substituirPastilhas() {
        this.nivelDeDesgaste = 0;  // Após substituição, desgaste zera
        System.out.println("Pastilhas de freio substituídas.");
    }

    public void ajustarFreio() {
        System.out.println("Sistema de freios ajustado.");
    }
}
