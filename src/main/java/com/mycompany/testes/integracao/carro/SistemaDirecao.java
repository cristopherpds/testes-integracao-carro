package com.mycompany.testes.integracao.carro;

public class SistemaDirecao {
    private String tipo;
    private boolean assistido;
    private String material;
    private double relacao;
    private String marca;

    public SistemaDirecao(String tipo, boolean assistido, String material, double relacao, String marca) {
        this.tipo = tipo;
        this.assistido = assistido;
        this.material = material;
        this.relacao = relacao;
        this.marca = marca;
    }

    public void ajustarDirecao(double angulo) {
        System.out.println("Direção ajustada para o ângulo: " + angulo);
    }

    public String verificarEstado() {
        if (this.relacao < 10) {
            return "Direção em mau estado";
        }
        return "Direção em bom estado";
    }

    public void substituirComponente(String componente) {
        System.out.println("Componente " + componente + " da direção substituído.");
    }
}
