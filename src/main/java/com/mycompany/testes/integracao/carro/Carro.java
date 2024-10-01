
package com.mycompany.testes.integracao.carro;

public class Carro {
    
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private double quilometragem;
    
    
    private Suspensao suspensao;
    private Freios freios;
    private Motor motor;
    private Pneus pneus;
    private SistemaCombustivel sistemaCombustivel;
    private SistemaEletrico sistemaEletrico;
    private SistemaDirecao sistemaDirecao;
    private Painel painel;
    private Portas portas;
    private Bancos bancos;
    private SistemaTransmissao transmissao;
    private Luzes luzes;  

    
    public Carro(String modelo, int ano, String cor, String placa, double quilometragem,
                 Suspensao suspensao, Freios freios, Motor motor, Pneus pneus, SistemaCombustivel sistemaCombustivel, 
                 SistemaEletrico sistemaEletrico, SistemaDirecao sistemaDirecao, Painel painel, Portas portas,
                 Bancos bancos, SistemaTransmissao transmissao, Luzes luzes) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.suspensao = suspensao;
        this.freios = freios;
        this.motor = motor;
        this.pneus = pneus;
        this.sistemaCombustivel = sistemaCombustivel;
        this.sistemaEletrico = sistemaEletrico;
        this.sistemaDirecao = sistemaDirecao;
        this.painel = painel;
        this.portas = portas;
        this.bancos = bancos;
        this.transmissao = transmissao;
        this.luzes = luzes;
    }

    public static void main(String[] args) {
        Suspensao suspensao = new Suspensao("Esportiva", "Aço", 20, 80, "MarcaX");
        Freios freios = new Freios("ABS", "Cerâmica", 15, "MarcaY", 30); 
        Motor motor = new Motor("V8", 500, 4.5, "MarcaZ", false);
        Pneus pneus = new Pneus("205/55R16", "Radial", 32, "MarcaA", "Novo");
        SistemaCombustivel sistemaCombustivel = new SistemaCombustivel("Gasolina", 50, 20, "MarcaB", true); 
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12, 100, "Íon de Lítio", true); 
        SistemaDirecao sistemaDirecao = new SistemaDirecao("Hidráulica", true, "Aço", 15, "MarcaD");
        Painel painel = new Painel("Digital", "LCD", true, "MarcaPainel", false);
        Portas portas = new Portas(4, "Alumínio", "Preto", "Automática", "Fechada");
        Bancos bancos = new Bancos(5, "Couro", "Preto", "Reclinável", "Bom");
        SistemaTransmissao transmissao = new SistemaTransmissao("Automática", 6, "Aço", "MarcaT", true); 
        Luzes luzes = new Luzes("LED", 100, "Branco", false, "ModeloLuzes"); 

        
        Carro carro = new Carro("Modelo A", 2021, "Preto", "ABC-1234", 0, suspensao, freios, motor, pneus, sistemaCombustivel, sistemaEletrico, sistemaDirecao, painel, portas, bancos, transmissao, luzes);

        
        carro.ligar();

        //carro.desligar();
    }


    public void ligar() {
        if (sistemaCombustivel.verificarNivel() <= 0) {
            System.out.println("Não há combustível suficiente para ligar o carro.");
            return;
        }

        
        if (!sistemaEletrico.verificarBateria()) {
            System.out.println("Problema no sistema elétrico. A bateria está descarregada.");
            return;
        }

        
        if (freios.verificarDesgaste() > 50) {
            System.out.println("Os freios estão muito desgastados para dirigir com segurança.");
            return;
        }

        if (suspensao.verificarEstado().contains("precária")) {
            System.out.println("A suspensão está em mau estado.");
            return;
        }

        
        if (!sistemaDirecao.verificarEstado().contains("bom")) {
            System.out.println("O sistema de direção não está em boas condições.");
            return;
        }

        
        if (pneus.verificarPressao() < 30) {
            System.out.println("A pressão dos pneus está muito baixa.");
            return;
        }

        
        if (portas.verificarEstado().contains("Aberta")) {
            System.out.println("As portas estão abertas, não é seguro dirigir.");
            return;
        }

        
        if (bancos.verificarEstado().contains("Danificado")) {
            System.out.println("Os bancos estão danificados.");
            return;
        }

        
        if (!transmissao.verificarEstado().contains("bom")) {
            System.out.println("A transmissão está com problemas.");
            return;
        }

    
        if (!luzes.verificarEstado()) {
            System.out.println("As luzes estão desligadas. Ligando as luzes...");
            luzes.ligar();
        }

        
        motor.ligar();
        painel.ligarDisplay();
        System.out.println("O carro está ligado e pronto para dirigir.");
    }

    
    public void desligar() {
        motor.desligar();
        painel.desligarDisplay();
        luzes.desligar();
        System.out.println("O carro está desligado.");
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

    public Suspensao getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(Suspensao suspensao) {
        this.suspensao = suspensao;
    }

    public Freios getFreios() {
        return freios;
    }

    public void setFreios(Freios freios) {
        this.freios = freios;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pneus getPneus() {
        return pneus;
    }

    public void setPneus(Pneus pneus) {
        this.pneus = pneus;
    }

    public SistemaCombustivel getSistemaCombustivel() {
        return sistemaCombustivel;
    }

    public void setSistemaCombustivel(SistemaCombustivel sistemaCombustivel) {
        this.sistemaCombustivel = sistemaCombustivel;
    }

    public SistemaEletrico getSistemaEletrico() {
        return sistemaEletrico;
    }

    public void setSistemaEletrico(SistemaEletrico sistemaEletrico) {
        this.sistemaEletrico = sistemaEletrico;
    }

    public SistemaDirecao getSistemaDirecao() {
        return sistemaDirecao;
    }

    public void setSistemaDirecao(SistemaDirecao sistemaDirecao) {
        this.sistemaDirecao = sistemaDirecao;
    }

    public Painel getPainel() {
        return painel;
    }

    public void setPainel(Painel painel) {
        this.painel = painel;
    }

    public Portas getPortas() {
        return portas;
    }

    public void setPortas(Portas portas) {
        this.portas = portas;
    }

    public Bancos getBancos() {
        return bancos;
    }

    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }

    public SistemaTransmissao getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(SistemaTransmissao transmissao) {
        this.transmissao = transmissao;
    }

    public Luzes getLuzes() {
        return luzes;
    }

    public void setLuzes(Luzes luzes) {
        this.luzes = luzes;
    }
    
}
