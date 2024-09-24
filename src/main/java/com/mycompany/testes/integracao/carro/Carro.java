
package com.mycompany.testes.integracao.carro;

public class Carro {
    // Atributos básicos
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private double quilometragem;
    
    // Componentes do carro
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
    private Luzes luzes;  // Adicionando o componente Luzes

    // Construtor
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

    // Método para ligar o carro
    public void ligar() {
        // Verificar combustível
        if (sistemaCombustivel.verificarNivel() <= 0) {
            System.out.println("Não há combustível suficiente para ligar o carro.");
            return;
        }

        // Verificar sistema elétrico (bateria)
        if (!sistemaEletrico.verificarBateria()) {
            System.out.println("Problema no sistema elétrico. A bateria está descarregada.");
            return;
        }

        // Verificar freios
        if (freios.verificarDesgaste() > 50) {
            System.out.println("Os freios estão muito desgastados para dirigir com segurança.");
            return;
        }

        // Verificar suspensão
        if (suspensao.verificarEstado().contains("precária")) {
            System.out.println("A suspensão está em mau estado.");
            return;
        }

        // Verificar direção
        if (!sistemaDirecao.verificarEstado().contains("bom")) {
            System.out.println("O sistema de direção não está em boas condições.");
            return;
        }

        // Verificar pressão dos pneus
        if (pneus.verificarPressao() < 30) {
            System.out.println("A pressão dos pneus está muito baixa.");
            return;
        }

        // Verificar estado das portas
        if (portas.verificarEstado().contains("Aberta")) {
            System.out.println("As portas estão abertas, não é seguro dirigir.");
            return;
        }

        // Verificar estado dos bancos
        if (bancos.verificarEstado().contains("Danificado")) {
            System.out.println("Os bancos estão danificados.");
            return;
        }

        // Verificar estado da transmissão
        if (!transmissao.verificarEstado().contains("bom")) {
            System.out.println("A transmissão está com problemas.");
            return;
        }

        // Verificar se as luzes estão ligadas
        if (!luzes.verificarEstado()) {
            System.out.println("As luzes estão desligadas. Ligando as luzes...");
            luzes.ligar();
        }

        // Se todas as verificações passarem, ligue o motor e o painel
        motor.ligar();
        painel.ligarDisplay();
        System.out.println("O carro está ligado e pronto para dirigir.");
    }

    // Método para desligar o carro
    public void desligar() {
        motor.desligar();
        painel.desligarDisplay();
        luzes.desligar();
        System.out.println("O carro está desligado.");
    }

    public static void main(String[] args) {
        // Criando os componentes do carro
        Suspensao suspensao = new Suspensao("Esportiva", "Aço", 20, 80, "MarcaX");
        Freios freios = new Freios("ABS", "Cerâmica", 15, "MarcaY", 30);  // Freios com 30% de desgaste
        Motor motor = new Motor("V8", 500, 4.5, "MarcaZ", false);
        Pneus pneus = new Pneus("205/55R16", "Radial", 32, "MarcaA", "Novo");
        SistemaCombustivel sistemaCombustivel = new SistemaCombustivel("Gasolina", 50, 20, "MarcaB", true);  // Combustível ok
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12, 100, "Íon de Lítio", true);  // Bateria ok
        SistemaDirecao sistemaDirecao = new SistemaDirecao("Hidráulica", true, "Aço", 15, "MarcaD");  // Direção ok
        Painel painel = new Painel("Digital", "LCD", true, "MarcaPainel", false);
        Portas portas = new Portas(4, "Alumínio", "Preto", "Automática", "Fechada");
        Bancos bancos = new Bancos(5, "Couro", "Preto", "Reclinável", "Bom");
        SistemaTransmissao transmissao = new SistemaTransmissao("Automática", 6, "Aço", "MarcaT", true);  // Transmissão ok
        Luzes luzes = new Luzes("LED", 100, "Branco", false, "ModeloLuzes");  // Luzes desligadas

        // Criando o carro com todos os componentes
        Carro carro = new Carro("Modelo A", 2021, "Preto", "ABC-1234", 0, suspensao, freios, motor, pneus, sistemaCombustivel, sistemaEletrico, sistemaDirecao, painel, portas, bancos, transmissao, luzes);

        // Tentando ligar o carro
        carro.ligar();  // Vai verificar todas as condições antes de ligar
        carro.desligar();  // Desligando o carro
    }
}
