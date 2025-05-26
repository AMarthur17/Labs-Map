import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Circulo;
import com.example.Visitante;
import com.example.VisitanteArea; // Só para testar o aceitar com um visitante real

public class testeCirculo {

    private Circulo circulo;

    @BeforeEach
    public void setUp() {
        circulo = new Circulo(5.0);
    }

    @Test
    public void testCriacaoComRaioValido() {
        assertEquals(5.0, circulo.getRaio());
    }

    @Test
    public void testCriacaoComRaioNegativoDeveLancarException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Circulo(-1.0);
        });
        assertEquals("Valores negativos não são permitidos!", thrown.getMessage());
    }

    @Test
    public void testSetRaioValido() {
        circulo.setRaio(10.0);
        assertEquals(10.0, circulo.getRaio());
    }

    @Test
    public void testSetRaioNegativoDeveLancarException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            circulo.setRaio(-5.0);
        });
        assertEquals("Valores negativos não são permitidos!", thrown.getMessage());
    }

    @Test
    public void testAceitarVisitante() {
        Visitante visitante = new VisitanteArea();
        String resultadoEsperado = "Área do círculo: " + (Math.PI * Math.pow(circulo.getRaio(), 2));
        assertEquals(resultadoEsperado, circulo.aceitar(visitante));
    }
}
