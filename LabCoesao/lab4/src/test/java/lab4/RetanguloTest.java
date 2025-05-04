package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        Retangulo retangulo = new Retangulo(4, 5);
        assertEquals(20, retangulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(4, 5);
        assertEquals(18, retangulo.calcularPerimetro());
    }

    @Test
    public void testToString() {
        Retangulo retangulo = new Retangulo(4, 5);
        assertTrue(retangulo.toString().contains("Retângulo com altura: 4 e largura: 5"));
    }

    
    @Test
    public void testAlturaZeroDeveLancarExcecao() {
        assertThrows(ValorInvalidoException.class, () -> new Retangulo(0, 5));
    }

    
    @Test
    public void testLarguraZeroDeveLancarExcecao() {
        assertThrows(ValorInvalidoException.class, () -> new Retangulo(4, 0));
    }

    
    @Test
    public void testAlturaNegativaDeveLancarExcecao() {
        assertThrows(ValorInvalidoException.class, () -> new Retangulo(-4, 5));
    }

    
    @Test
    public void testLarguraNegativaDeveLancarExcecao() {
        assertThrows(ValorInvalidoException.class, () -> new Retangulo(4, -5));
    }

    
    @Test
    public void testAlturaELarguraNegativaDeveLancarExcecao() {
        assertThrows(ValorInvalidoException.class, () -> new Retangulo(-4, -5));
    }
}
