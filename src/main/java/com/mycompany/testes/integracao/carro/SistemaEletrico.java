package com.mycompany.testes.integracao.carro;

public class SistemaEletrico {
    private double voltagem;
    private double capacidade;
    private String tipoDeBateria;
    private boolean estado;  // true se a bateria estiver funcionando, false se não

    public SistemaEletrico(double voltagem, double capacidade, String tipoDeBateria, boolean estado) {
        this.voltagem = voltagem;
        this.capacidade = capacidade;
        this.tipoDeBateria = tipoDeBateria;
        this.estado = estado;
    }

    public boolean verificarBateria() {
        return this.estado;
    }

    public void substituirBateria() {
        this.estado = true;  // Após substituir, a bateria volta a funcionar
        System.out.println("Bateria substituída e funcionando.");
    }

    public void testarSistema() {
        if (this.estado) {
            System.out.println("Sistema elétrico funcionando corretamente.");
        } else {
            System.out.println("Falha no sistema elétrico.");
        }
    }
}
