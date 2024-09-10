package com.mycompany.testes.integracao.carro;

public class SistemaEletrico {

    private double voltagem;
    private double capacidade;
    private String tipoDeBateria;
    private boolean estado;
    private String marca;

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoDeBateria() {
        return tipoDeBateria;
    }

    public void setTipoDeBateria(String tipoDeBateria) {
        this.tipoDeBateria = tipoDeBateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public boolean verificarBateria() {
        return estado;
    }

    public void substituirBateria(SistemaEletrico novaBateria) {
        this.voltagem = novaBateria.getVoltagem();
        this.capacidade = novaBateria.getCapacidade();
        this.tipoDeBateria = novaBateria.getTipoDeBateria();
        this.estado = true;
        this.marca = novaBateria.getMarca();
    }

    public static void testarSistema() {
        SistemaEletrico sistema = new SistemaEletrico();
        sistema.setMarca("Tesla");
        sistema.setVoltagem(240);
        sistema.setCapacidade(2000);
        sistema.setTipoDeBateria("Li-ion");
        sistema.setEstado(true);
        
        SistemaEletrico novaBateria = new SistemaEletrico();
        novaBateria.setMarca("Sony");
        novaBateria.setVoltagem(240);
        novaBateria.setCapacidade(2500);
        novaBateria.setTipoDeBateria("Ni-Cd");
        sistema.substituirBateria(novaBateria);
        
        System.out.println("Marca da bateria: " + sistema.getMarca());
        System.out.println("Voltagem da bateria: " + sistema.getVoltagem() + "V");
        if (sistema.verificarBateria()) {
            System.out.println("Bateria está carregada.");
        } else {
            System.out.println("Bateria está descarregada.");
        }
        
        System.out.println("\nTestando substituição da bateria...");
        System.out.println("Voltagem da nova bateria: " + novaBateria.getVoltagem() + "V");
        if (novaBateria.verificarBateria()) {
            System.out.println("Nova bateria está carregada.");
        } else {
            System.out.println("Nova bateria está descarregada.");
        }
    }

}
