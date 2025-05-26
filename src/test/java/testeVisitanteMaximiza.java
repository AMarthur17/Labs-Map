import com.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testeVisitanteMaximiza {

    @Test
    void deveMaximizarRetangulo() {
        Retangulo r = new Retangulo(3, 4);
        VisitanteMaximiza visitante = new VisitanteMaximiza();

        String resultado = visitante.visitarRetangulo(r);

        assertEquals(6, r.getLargura());
        assertEquals(8, r.getAltura());
        assertTrue(resultado.contains("Retângulo antes"));
        assertTrue(resultado.contains("Retângulo maximizado"));
    }

    @Test
    void deveMaximizarTrapezio() {
        Trapezio t = new Trapezio(5, 3, 2);
        VisitanteMaximiza visitante = new VisitanteMaximiza();

        String resultado = visitante.visitarTrapezio(t);

        assertEquals(10, t.getBaseMaior());
        assertEquals(6, t.getBaseMenor());
        assertEquals(4, t.getAltura());
        assertTrue(resultado.contains("Trapézio antes"));
        assertTrue(resultado.contains("Trapézio maximizado"));
    }

    @Test
    void deveMaximizarTriangulo() {
        Triangulo t = new Triangulo(4, 5);
        VisitanteMaximiza visitante = new VisitanteMaximiza();

        String resultado = visitante.visitarTriangulo(t);

        assertEquals(8, t.getBase());
        assertEquals(10, t.getAltura());
        assertTrue(resultado.contains("Triângulo antes"));
        assertTrue(resultado.contains("Triângulo maximizado"));
    }

    @Test
    void deveMaximizarCirculo() {
        Circulo c = new Circulo(2.5);
        VisitanteMaximiza visitante = new VisitanteMaximiza();

        String resultado = visitante.visitarCirculo(c);

        assertEquals(5.0, c.getRaio());
        assertTrue(resultado.contains("Raio antigo do círculo"));
        assertTrue(resultado.contains("Novo raio do círculo"));
    }
}
