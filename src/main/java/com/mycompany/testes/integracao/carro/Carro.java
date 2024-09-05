/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testes.integracao.carro;

/**
 *
 * @author IFSul
 */
public class Carro {

    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private double quilometragem; 

    
    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public double getQuilometragem() {
        return quilometragem;
    }


    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void ligar() {
        System.out.println("O carro foi ligado.");
    }

    public void desligar() {
        System.out.println("O carro foi desligado.");
    }

    public void atualizarQuilometragem(double km) {
        quilometragem += km;
    }


}
