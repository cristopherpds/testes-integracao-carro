package com.mycompany.testes.integracao.carro;

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
    
    public static void main(String[] args) {
        SistemaCombustivel sistemaCombustivel = new SistemaCombustivel();
        sistemaCombustivel.setEstado(true);
        

        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        sistemaEletrico.setEstado(true);

        Luzes luzes = new Luzes(sistemaEletrico);
        luzes.ligar();
        luzes.ajustarIntensidade(50); 
        luzes.desligar(); 

        try {
            luzes.ajustarIntensidade(70); 
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        sistemaEletrico.setEstado(false);
        luzes.ligar(); 

        Portas portas = new Portas();
        portas.setEstado(false);

        Carro carro = new Carro(null, null, luzes, null, null, null, portas, sistemaCombustivel, null, sistemaEletrico, null, null);
        carro.ligar();  
    }
}
