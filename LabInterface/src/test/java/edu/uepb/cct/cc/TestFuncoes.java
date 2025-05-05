package edu.uepb.cct.cc; // Certifique-se de que está no pacote Test

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TestFuncoes {

    private Ator ator;
    private Camera camera;
    private Cinegrafista cinegrafista;
    private Diretor diretor;
    private Roteirista roteirista;

    @BeforeEach
    public void setup() {
        // Inicializando os objetos antes de cada teste
        ator = new Ator();
        camera = new Camera();
        cinegrafista = new Cinegrafista();
        diretor = new Diretor();
        roteirista = new Roteirista();
    }

    @Test
    void testGetDescricaoAssertTrue() {
        // Testando se o método getDescricao retorna o valor correto
        assertEquals("Ator", ator.getDescricao());
        assertEquals("Camera", camera.getDescricao());
        assertEquals("Cinegrafista", cinegrafista.getDescricao());
        assertEquals("Diretor", diretor.getDescricao());
        assertEquals("Roteirista", roteirista.getDescricao());
    }

    @Test
    void testGetDescricaoAssertFalse() {
        // Testando se o método getDescricao NÃO retorna valores errados
        assertNotEquals("Camera", ator.getDescricao());
        assertNotEquals("Cinegrafista", ator.getDescricao());
        assertNotEquals("Diretor", ator.getDescricao());
        assertNotEquals("Roteirista", ator.getDescricao());

        assertNotEquals("Ator", camera.getDescricao());
        assertNotEquals("Cinegrafista", camera.getDescricao());
        assertNotEquals("Diretor", camera.getDescricao());
        assertNotEquals("Roteirista", camera.getDescricao());

        assertNotEquals("Ator", cinegrafista.getDescricao());
        assertNotEquals("Diretor", cinegrafista.getDescricao());
        assertNotEquals("Camera", cinegrafista.getDescricao());
        assertNotEquals("Roteirista", cinegrafista.getDescricao());

        assertNotEquals("Ator", diretor.getDescricao());
        assertNotEquals("Cinegrafista", diretor.getDescricao());
        assertNotEquals("Camera", diretor.getDescricao());
        assertNotEquals("Roteirista", diretor.getDescricao());

        assertNotEquals("Ator", roteirista.getDescricao());
        assertNotEquals("Diretor", roteirista.getDescricao());
        assertNotEquals("Camera", roteirista.getDescricao());
        assertNotEquals("Cinegrafista", roteirista.getDescricao());
    }
}
