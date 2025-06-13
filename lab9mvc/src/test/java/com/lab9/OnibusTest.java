package com.lab9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnibusTest {
    private Onibus onibus;
    private PainelCentral painelCentral;
    private Quiosque quiosque;

    @BeforeEach
    void setUp() {
        onibus = new Onibus(5); 
        painelCentral = new PainelCentral();
        quiosque = new Quiosque();

        onibus.adicionarListener(painelCentral);
        onibus.adicionarListener(quiosque);
    }

    @Test
    void testReservarAssento() {
        onibus.reservarAssento(1);

        Assento assento = onibus.getAssento(1);
        assertEquals("reservado", assento.getStatus(), "O assento deve estar reservado");
    }

    @Test
    void testComprarAssento() {
        onibus.comprarAssento(2);

        Assento assento = onibus.getAssento(2);
        assertEquals("indisponível", assento.getStatus(), "O assento deve estar indisponível");
    }

    @Test
    void testNotificacaoPainelCentral() {
        AssentoListener painel = new AssentoListener() {
            @Override
            public void atualizarAssento(AssentoEvent evento) {
                assertEquals(1, evento.getAssento().getNumero());
                assertEquals("reservado", evento.getAssento().getStatus());
            }
        };
        onibus.adicionarListener(painel);

        onibus.reservarAssento(1);
    }

    @Test
    void testNotificacaoQuiosque() {
        AssentoListener quiosque = new AssentoListener() {
            @Override
            public void atualizarAssento(AssentoEvent evento) {
                assertEquals(2, evento.getAssento().getNumero());
                assertEquals("indisponível", evento.getAssento().getStatus());
            }
        };
        onibus.adicionarListener(quiosque);

        onibus.comprarAssento(2);
    }
}
