import com.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VisitanteInfoTest {

    @Test
    void deveRetornarInfoDoCirculo() {
        Circulo c = new Circulo(3.5);
        VisitanteInfo visitante = new VisitanteInfo();

        String resultado = visitante.visitarCirculo(c);

        assertEquals("Círculo de raio 3.5", resultado);
    }

    @Test
    void deveRetornarInfoDoTriangulo() {
        Triangulo t = new Triangulo(4, 6);
        VisitanteInfo visitante = new VisitanteInfo();

        String resultado = visitante.visitarTriangulo(t);

        assertEquals("Triângulo com base 4.0 e altura 6.0", resultado);
    }

    @Test
    void deveRetornarInfoDoRetangulo() {
        Retangulo r = new Retangulo(5, 7);
        VisitanteInfo visitante = new VisitanteInfo();

        String resultado = visitante.visitarRetangulo(r);

        assertEquals("Retângulo com largura 5.0 e altura 7.0", resultado);
    }

    @Test
    void deveRetornarInfoDoTrapezio() {
        Trapezio t = new Trapezio(8, 4, 3);
        VisitanteInfo visitante = new VisitanteInfo();

        String resultado = visitante.visitarTrapezio(t);

        assertEquals("Trapézio com base maior 8.0, base menor 4.0 e altura 3.0", resultado);
    }
}
