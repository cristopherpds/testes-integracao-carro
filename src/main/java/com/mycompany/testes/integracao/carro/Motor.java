package com.mycompany.testes.integracao.carro;

public class Motor {

    private String tipo;
    private int potencia;
    private double cilindrada;
    private String marca;
    private boolean estado;

    
    
    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public int getPotencia() {
        return potencia;
    }


    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    public double getCilindrada() {
        return cilindrada;
    }


    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
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


    public void ligarMotor() {
        if (!estado) {
            System.out.println("Motor ligado");
            estado = true;
        } else {
            System.out.println("Motor já está ligado");
        }
    }
    
   
    public void desligarMotor() {
        if (estado) {
            System.out.println("Motor desligado");
            estado = false;
        } else {
            System.out.println("Motor já está desligado");
        }
    }

    public boolean verificarEstado() {
        return estado;
    }
}
