package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTest {

    @Test
    public void testCalcularArea() {
        Quadrado quadrado = new Quadrado(4);
        assertEquals(16, quadrado.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        Quadrado quadrado = new Quadrado(4);
        assertEquals(16, quadrado.calcularPerimetro());
    }

    @Test
    public void testToString() {
        Quadrado quadrado = new Quadrado(4);
        assertTrue(quadrado.toString().contains("Quadrado com lado: 4"));
    }

    
    @Test
    public void testLadoZeroDeveLancarExcecao() {
        assertThrows(ValorInvalidoException.class, () -> new Quadrado(0));
    }

    @Test
    public void testLadoNegativoDeveLancarExcecao() {
        assertThrows(ValorInvalidoException.class, () -> new Quadrado(-3));
    }
}
