package com.mycompany.testes.integracao.carro;

public class Pneus {
    private String tamanho;
    private String tipo;
    private double pressao;
    private String marca;
    private String estado;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public boolean verificarPressao() {

        if (pressao < 2.5) {
            estado = "ruim";
            return true; 
        } else {
            estado = "bom";
            return false;
        }
    }


    public void ajustarPressao(double novaPressao) {
        this.pressao = novaPressao;
        verificarPressao();
    }

    public void substituir(Pneus novoPneu) {
        this.tamanho = novoPneu.getTamanho();
        this.tipo = novoPneu.getTipo();
        this.pressao = novoPneu.getPressao();
        this.marca = novoPneu.getMarca();
        this.estado = novoPneu.getEstado();
    }



}
