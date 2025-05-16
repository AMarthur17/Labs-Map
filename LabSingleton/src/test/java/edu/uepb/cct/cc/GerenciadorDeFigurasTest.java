package edu.uepb.cct.cc; 

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class GerenciadorDeFigurasTest {

    @Test
    void testeCirculoUnico() {
        Figura circulo1 = GerenciadorDeFiguras.obterCirculo();
        Figura circulo2 = GerenciadorDeFiguras.obterCirculo();

        assertNotNull(circulo1, "Círculo não deve ser nulo");
        assertSame(circulo1, circulo2, "Deve retornar a mesma instância (Singleton)");
    }

    @Test
    void testeTrianguloIsoscelesUnico() {
        Figura triangulo1 = GerenciadorDeFiguras.obterTriangulo("isosceles");
        Figura triangulo2 = GerenciadorDeFiguras.obterTriangulo("isosceles");

        assertNotNull(triangulo1, "Triângulo isósceles não deve ser nulo");
        assertSame(triangulo1, triangulo2, "Triângulo isósceles deve ser único");
    }

    @Test
    void testeTrianguloEquilateroUnico() {
        Figura triangulo1 = GerenciadorDeFiguras.obterTriangulo("equilatero");
        Figura triangulo2 = GerenciadorDeFiguras.obterTriangulo("equilatero");

        assertNotNull(triangulo1, "Triângulo equilátero não deve ser nulo");
        assertSame(triangulo1, triangulo2, "Triângulo equilátero deve ser único");
    }

    @Test
    void testeTrianguloRetanguloUnico() {
        Figura triangulo1 = GerenciadorDeFiguras.obterTriangulo("retangulo");
        Figura triangulo2 = GerenciadorDeFiguras.obterTriangulo("retangulo");

        assertNotNull(triangulo1, "Triângulo retângulo não deve ser nulo");
        assertSame(triangulo1, triangulo2, "Triângulo retângulo deve ser único");
    }

    @Test
    void testeTrianguloTipoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GerenciadorDeFiguras.obterTriangulo("trapézio");
        });

        assertEquals("Tipo de triângulo inválido: trapézio", exception.getMessage());
    }

    @Test
    void testeQuadradosDiferentes() {
        Figura quadrado1 = GerenciadorDeFiguras.criarQuadrado();
        Figura quadrado2 = GerenciadorDeFiguras.criarQuadrado();

        assertNotNull(quadrado1, "Quadrado1 não deve ser nulo");
        assertNotNull(quadrado2, "Quadrado2 não deve ser nulo");
        assertNotSame(quadrado1, quadrado2, "Cada quadrado deve ser uma nova instância");
    }
}
