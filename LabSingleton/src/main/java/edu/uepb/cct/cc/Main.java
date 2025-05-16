package edu.uepb.cct.cc;

public class Main {
    public static void main(String[] args) {
        try {
            Figura circulo1 = GerenciadorDeFiguras.obterCirculo();
            Figura circulo2 = GerenciadorDeFiguras.obterCirculo();

            circulo1.desenhar();
            circulo2.desenhar();
            System.out.println("Mesmo círculo? " + (circulo1 == circulo2)); // true

            Figura triangulo1 = GerenciadorDeFiguras.obterTriangulo("isosceles");
            Figura triangulo2 = GerenciadorDeFiguras.obterTriangulo("equilatero");
            Figura triangulo3 = GerenciadorDeFiguras.obterTriangulo("retangulo");

            triangulo1.desenhar();
            triangulo2.desenhar();
            triangulo3.desenhar();

            Figura quadrado1 = GerenciadorDeFiguras.criarQuadrado();
            Figura quadrado2 = GerenciadorDeFiguras.criarQuadrado();

            quadrado1.desenhar();
            quadrado2.desenhar();
            System.out.println("Mesmo quadrado? " + (quadrado1 == quadrado2)); // false
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
