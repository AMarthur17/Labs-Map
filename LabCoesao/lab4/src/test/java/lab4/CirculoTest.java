package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    @Test
    public void testCalcularArea() {
        Circulo circulo = new Circulo(3);
        assertEquals(Math.PI * 9, circulo.calcularArea(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        Circulo circulo = new Circulo(3);
        assertEquals(2 * Math.PI * 3, circulo.calcularPerimetro(), 0.0001);
    }

    
    @Test
    public void testRaioZeroDeveLancarExcecao() {
        assertThrows(ValorInvalidoException.class, () -> new Circulo(0));
    }

    
    @Test
    public void testRaioNegativoDeveLancarExcecao() {
        assertThrows(ValorInvalidoException.class, () -> new Circulo(-3));
    }
}
