package com.lab9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssentoTest {
    private Assento assento;

    @BeforeEach
    public void setUp() {
        assento = new Assento(1, "disponível");
    }

    @Test
    public void testGetNumero() {
        assertEquals(1, assento.getNumero());
    }

    @Test
    public void testInitialStatus() {
        assertEquals("disponível", assento.getStatus());
    }

    @Test
    public void testReservarAssento() {
        assento.setStatus("reservado");
        assertEquals("reservado", assento.getStatus());
    }

    @Test
    public void testIndisponibilizarAssento() {
        assento.setStatus("indisponível");
        assertEquals("indisponível", assento.getStatus());
    }
}
