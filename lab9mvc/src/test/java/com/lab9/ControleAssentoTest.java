package com.lab9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControleAssentoTest {
    private ControleAssento controleAssento;
    private Onibus onibus;

    @BeforeEach
    public void setUp() {
        onibus = new Onibus(10); // Exemplo com 10 assentos
        controleAssento = new ControleAssento(onibus);
    }

    @Test
    public void testReservarAssento() {
        int numeroAssento = 1;
        controleAssento.reservarAssento(numeroAssento);
        Assento assento = onibus.getAssento(numeroAssento);
        assertEquals("reservado", assento.getStatus());
    }

    @Test
    public void testComprarAssento() {
        int numeroAssento = 2;
        controleAssento.comprarAssento(numeroAssento);
        Assento assento = onibus.getAssento(numeroAssento);
        assertEquals("indisponível", assento.getStatus());
    }
}
