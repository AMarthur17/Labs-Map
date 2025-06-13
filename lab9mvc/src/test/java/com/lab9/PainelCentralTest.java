package com.lab9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PainelCentralTest {

    @Test
    public void testAtualizarAssento_Disponivel() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        Assento assento = new Assento(1, "disponível");
        AssentoEvent evento = new AssentoEvent(assento);
        PainelCentral painel = new PainelCentral();
        painel.atualizarAssento(evento);

        System.setOut(System.out);

        String esperado = "PainelCentral: Assento 1 agora está verde";
        assertTrue(saidaCapturada.toString().trim().contains(esperado));
    }

    @Test
    public void testAtualizarAssento_Reservado() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        Assento assento = new Assento(2, "reservado");
        AssentoEvent evento = new AssentoEvent(assento);
        PainelCentral painel = new PainelCentral();
        painel.atualizarAssento(evento);

        System.setOut(System.out);

        String esperado = "PainelCentral: Assento 2 agora está amarelo";
        assertTrue(saidaCapturada.toString().trim().contains(esperado));
    }

    @Test
    public void testAtualizarAssento_Indisponivel() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        Assento assento = new Assento(3, "indisponível");
        AssentoEvent evento = new AssentoEvent(assento);
        PainelCentral painel = new PainelCentral();
        painel.atualizarAssento(evento);

        System.setOut(System.out);

        String esperado = "PainelCentral: Assento 3 agora está vermelho";
        assertTrue(saidaCapturada.toString().trim().contains(esperado));
    }

    @Test
    public void testAtualizarAssento_StatusDesconhecido() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        Assento assento = new Assento(4, "em manutenção");
        AssentoEvent evento = new AssentoEvent(assento);
        PainelCentral painel = new PainelCentral();
        painel.atualizarAssento(evento);

        System.setOut(System.out);

        String esperado = "PainelCentral: Assento 4 agora está sem cor definida";
        assertTrue(saidaCapturada.toString().trim().contains(esperado));
    }
}
