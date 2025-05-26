import com.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testeTriangulo {

    @Test
    void deveCriarTrianguloValido() {
        Triangulo t = new Triangulo(4, 5);
        assertEquals(4, t.getBase());
        assertEquals(5, t.getAltura());
    }

    @Test
    void deveLancarExcecaoParaValoresNegativosNoConstrutor() {
        assertThrows(IllegalArgumentException.class, () -> new Triangulo(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> new Triangulo(1, -2));
    }

    @Test
    void deveAceitarVisitanteMaximiza() {
        Triangulo t = new Triangulo(3, 4);
        Visitante visitante = new VisitanteMaximiza();
        String resultado = t.aceitar(visitante);
        assertEquals(6, t.getBase());
        assertEquals(8, t.getAltura());
        assertTrue(resultado.contains("Triângulo antes"));
        assertTrue(resultado.contains("Triângulo maximizado"));
    }
}
