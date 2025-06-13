package com.lab9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class QuiosqueTest {

    @Test
    public void testAtualizarAssento_ImprimeMensagemCorreta() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        Assento assento = new Assento(5, "Livre");
        assento.setStatus("Reservado");

        AssentoEvent evento = new AssentoEvent(assento);
        Quiosque quiosque = new Quiosque();
        quiosque.atualizarAssento(evento);

        System.setOut(System.out);

        String saidaEsperada = "Quiosque: Assento 5 agora está Reservado";
        assertTrue(saidaCapturada.toString().trim().contains(saidaEsperada));
    }
}
