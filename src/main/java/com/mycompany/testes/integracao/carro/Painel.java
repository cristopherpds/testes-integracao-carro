package com.mycompany.testes.integracao.carro;

/**
 * The Painel class represents a car dashboard panel with various attributes and functionalities.
 * It includes methods to control the display and update information shown on the panel.
 * 
 * Attributes:
 * - tipo: The type of the panel.
 * - display: The display type of the panel.
 * - controle: Indicates if the panel has control features.
 * - marca: The brand of the panel.
 * - estado: The state of the panel (on/off).
 * 
 * Methods:
 * - getTipo(): Returns the type of the panel.
 * - setTipo(String tipo): Sets the type of the panel.
 * - getDisplay(): Returns the display type of the panel.
 * - setDisplay(String display): Sets the display type of the panel.
 * - isControle(): Returns if the panel has control features.
 * - setControle(boolean controle): Sets the control feature of the panel.
 * - getMarca(): Returns the brand of the panel.
 * - setMarca(String marca): Sets the brand of the panel.
 * - isEstado(): Returns the state of the panel (on/off).
 * - setEstado(boolean estado): Sets the state of the panel (on/off).
 * - ligarDisplay(): Turns on the display of the panel.
 * - desligarDisplay(): Turns off the display of the panel.
 * - atualizarInformacoes(String info): Updates the information displayed on the panel.
 */
public class Painel {

    private String tipo;
    private String display;
    private boolean controle;
    private String marca;
    private boolean estado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public boolean isControle() {
        return controle;
    }

    public void setControle(boolean controle) {
        this.controle = controle;
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


    public void ligarDisplay() {
        System.out.println("Display ligado");
    }

    
    public void desligarDisplay() {
        System.out.println("Display desligado");
    }

   
    public void atualizarInformacoes(String info) {
        System.out.println("Informações atualizadas: " + info);
    }
    
}
