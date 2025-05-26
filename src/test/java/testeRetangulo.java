import com.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testeRetangulo {

    @Test
    void deveCriarRetanguloValido() {
        Retangulo r = new Retangulo(4.0, 5.0);
        assertEquals(4.0, r.getLargura());
        assertEquals(5.0, r.getAltura());
    }

    @Test
    void deveLancarExcecaoParaValoresNegativosNoConstrutor() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(1, -2));
    }

    @Test
    void deveLancarExcecaoAoSetarLarguraNegativa() {
        Retangulo r = new Retangulo(2, 3);
        assertThrows(IllegalArgumentException.class, () -> r.setLargura(-1));
    }

    @Test
    void deveLancarExcecaoAoSetarAlturaNegativa() {
        Retangulo r = new Retangulo(2, 3);
        assertThrows(IllegalArgumentException.class, () -> r.setAltura(-1));
    }

    @Test
    void deveAceitarVisitanteMaximizacao() {
        Retangulo r = new Retangulo(2, 3);
        Visitante visitante = new VisitanteMaximiza();
        String resultado = r.aceitar(visitante);
        assertEquals(4, r.getLargura());
        assertEquals(6, r.getAltura());
        assertTrue(resultado.contains("Retângulo antes"));
        assertTrue(resultado.contains("Retângulo maximizado"));
    }
}
