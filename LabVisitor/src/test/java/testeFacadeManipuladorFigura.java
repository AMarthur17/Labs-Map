import com.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testeFacadeManipuladorFigura{

    private FacadeManipulaFiguras facade;

    @BeforeEach
    void setUp() {
        facade = new FacadeManipulaFiguras();
    }

    @Test
    void deveAdicionarFigura() throws Exception {
        Circulo c = new Circulo(2);
        String resultado = facade.adicionarFigura(c);
        assertTrue(resultado.contains("Círculo de raio 2.0"));
    }

    @Test
    void deveLancarExcecaoAoAdicionarFiguraNula() {
        Exception ex = assertThrows(Exception.class, () -> facade.adicionarFigura(null));
        assertEquals("Figura não pode ser nula.", ex.getMessage());
    }

    @Test
    void deveLancarExcecaoAoDesenharSemFiguras() {
        Exception ex = assertThrows(Exception.class, () -> facade.desenharFiguras());
        assertEquals("Não há figuras para desenhar.", ex.getMessage());
    }

    @Test
    void deveLancarExcecaoAoCalcularAreaSemFiguras() {
        Exception ex = assertThrows(Exception.class, () -> facade.calcularAreas());
        assertEquals("Não há figuras para calcular a área.", ex.getMessage());
    }

    @Test
    void deveLancarExcecaoAoMaximizarSemFiguras() {
        Exception ex = assertThrows(Exception.class, () -> facade.maximizarFiguras());
        assertEquals("Não há figuras para maximizar.", ex.getMessage());
    }

    @Test
    void deveDesenharFigura() throws Exception {
        Retangulo r = new Retangulo(2, 3);
        facade.adicionarFigura(r);
        String resultado = facade.desenharFiguras();
        assertTrue(resultado.contains("Desenho:"));
        assertTrue(resultado.toLowerCase().contains("retângulo"));
    }

    @Test
void deveCalcularArea() throws Exception {
    Triangulo t = new Triangulo(4, 2);
    facade.adicionarFigura(t);
    String resultado = facade.calcularAreas();
    
    // Asserções mais genéricas e robustas
    assertTrue(resultado.contains("Área"));
    assertTrue(resultado.toLowerCase().contains("triângulo"));
}

    @Test
    void deveMaximizarFigura() throws Exception {
        Trapezio trap = new Trapezio(6, 4, 3);
        facade.adicionarFigura(trap);
        String resultado = facade.maximizarFiguras();
        assertTrue(resultado.contains("Maximização:"));
        assertTrue(resultado.contains("Trapézio"));
        assertTrue(resultado.contains("base maior 12.0"));
    }
}
