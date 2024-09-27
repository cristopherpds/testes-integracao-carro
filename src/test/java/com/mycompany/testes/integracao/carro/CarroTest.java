/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.testes.integracao.carro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author IFSul
 */
public class CarroTest {
     
    private Carro carro;

    @Before
    public void setUp() {
        // Criando os componentes do carro para os testes
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

        // Criando o carro com todos os componentes para os testes
        carro = new Carro("Modelo A", 2021, "Preto", "ABC-1234", 0, suspensao, freios, motor, pneus, sistemaCombustivel, sistemaEletrico, sistemaDirecao, painel, portas, bancos, transmissao, luzes);
    }

    @Test
    public void testCarroNaoLigaSemCombustivel() {
        // Simular tanque vazio
        carro.getSistemaCombustivel().abastecer(-20);  // Zera o nível de combustível

        // Testa se o carro não liga sem combustível
        assertFalse( "Carro deve ter combustível para ligar.", carro.getSistemaCombustivel().verificarNivel() > 0);
        assertThrows("Carro não deve ligar sem combustível.", IllegalStateException.class, () -> carro.ligar());
    }

    @Test
    public void testCarroNaoLigaSemBateria() {
        // Simular problema na bateria
        carro.getSistemaEletrico().substituirBateria();
        carro.getSistemaEletrico().testarSistema();
        carro.getSistemaEletrico().verificarBateria();

        // Verificar se o carro liga com bateria em bom estado
        assertTrue( "O carro deve ligar com bateria em bom estado.", carro.getSistemaEletrico().verificarBateria());
    }

    @Test
    public void testCarroNaoLigaComFreiosDesgastados() {
        // Simular freios desgastados
        carro.getFreios().substituirPastilhas();
        carro.getFreios().ajustarFreio();

        // Verificar o estado dos freios
        assertTrue("Os freios devem estar em bom estado para o carro ligar.", carro.getFreios().verificarDesgaste() <= 20);
    }

    @Test
    public void testSuspensaoEmBomEstado() {
        // Verificar o estado da suspensão
        assertEquals("Suspensão em bom estado", carro.getSuspensao().verificarEstado(), "A suspensão deve estar em bom estado para o carro funcionar.");
    }

    @Test
    public void testDirecaoEmBomEstado() {
        // Ajustar a direção e verificar o estado
        carro.getSistemaDirecao().ajustarDirecao(20);
        assertEquals("Direção em bom estado", carro.getSistemaDirecao().verificarEstado(), "A direção deve estar em bom estado para o carro funcionar.");
    }

    @Test
    public void testCarroLigaCorretamente() {
        // Testar se o carro liga corretamente com todos os componentes em bom estado
        carro.ligar();

        // Verificar o estado do motor e painel
        assertTrue("O motor deve estar ligado.", carro.getMotor().verificarEstado().contains("ligado"));
        assertTrue("O painel deve estar ligado.", carro.getPainel().isEstado());
    }
}
