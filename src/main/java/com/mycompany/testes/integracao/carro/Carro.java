
package com.mycompany.testes.integracao.carro;

public class Carro {

    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private double quilometragem;
    private boolean ligado;

    private Bancos bancos;
    private Freios freios;
    private Luzes luzes;
    private Motor motor;
    private Painel painel;
    private Pneus pneus;
    private Portas portas;
    private SistemaCombustivel sistemaCombustivel;
    private SistemaDirecao sistemaDirecao;
    private SistemaEletrico sistemaEletrico;
    private SistemaTransmissao sistemaTransmissao;
    private Suspensao suspensao;
    
    
    public Carro() {
    }


    public Carro(Bancos bancos, Freios freios, Luzes luzes, Motor motor, Painel painel, Pneus pneus, Portas portas, SistemaCombustivel sistemaCombustivel, SistemaDirecao sistemaDirecao, SistemaEletrico sistemaEletrico, SistemaTransmissao sistemaTransmissao, Suspensao suspensao) {
        this.bancos = bancos;
        this.freios = freios;
        this.luzes = luzes;
        this.motor = motor;
        this.painel = painel;
        this.pneus = pneus;
        this.portas = portas;
        this.sistemaCombustivel = sistemaCombustivel;
        this.sistemaDirecao = sistemaDirecao;
        this.sistemaEletrico = sistemaEletrico;
        this.sistemaTransmissao = sistemaTransmissao;
        this.suspensao = suspensao;
        this.ligado = false;
    }


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


    public boolean podeLigar() {
        return sistemaCombustivel.isTemCombustivel() && sistemaEletrico.isEstado() && portas.isPortaAberta();
    }
    
    public void ligar() {
        if (podeLigar()) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("Não é possível ligar o carro.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void atualizarQuilometragem(double km) {
        quilometragem += km;
    }


}
