package com.lab9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssentoEventTest {
    private AssentoEvent event;
    private Assento assento;

    @BeforeEach
    public void setUp() {
        assento = new Assento(1, "disponível");
        event = new AssentoEvent(assento);
    }

    @Test
    public void testAssentoEventCreation() {
        assertNotNull(event);
        assertEquals(assento, event.getAssento());
    }

    @Test
    public void testGetAssentoFromEvent() {
        assertEquals(1, event.getAssento().getNumero());
        assertEquals("disponível", event.getAssento().getStatus());
    }
}
