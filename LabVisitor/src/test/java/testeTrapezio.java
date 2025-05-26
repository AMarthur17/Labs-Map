import com.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testeTrapezio {

    @Test
    void deveCriarTrapezioValido() {
        Trapezio t = new Trapezio(6, 4, 3);
        assertEquals(6, t.getBaseMaior());
        assertEquals(4, t.getBaseMenor());
        assertEquals(3, t.getAltura());
    }

    @Test
    void deveLancarExcecaoParaValoresNegativosNoConstrutor() {
        assertThrows(IllegalArgumentException.class, () -> new Trapezio(-1, 4, 3));
        assertThrows(IllegalArgumentException.class, () -> new Trapezio(6, -4, 3));
        assertThrows(IllegalArgumentException.class, () -> new Trapezio(6, 4, -3));
    }

    @Test
    void deveAceitarVisitanteMaximiza() {
        Trapezio t = new Trapezio(5, 3, 2);
        Visitante visitante = new VisitanteMaximiza();
        String resultado = t.aceitar(visitante);
        assertEquals(10, t.getBaseMaior());
        assertEquals(6, t.getBaseMenor());
        assertEquals(4, t.getAltura());
        assertTrue(resultado.contains("Trapézio antes"));
        assertTrue(resultado.contains("Trapézio maximizado"));
    }
}
