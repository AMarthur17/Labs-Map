package edu.uepb.cct.cc;

public class GerenciadorDeFiguras {

    //Instância única (singleton) de Circulo
    private static Circulo circulo; 

    //Instâncias únicas (singleton) para cada tipo de Triângulo
    private static Triangulo trianguloIsosceles;
    private static Triangulo trianguloEquilatero;
    private static Triangulo trianguloRetangulo;


    //Método de acesso Singleton para Circulo
    public static Circulo obterCirculo() {
        if (circulo == null) { // verifica se a instância já existe
            circulo = new Circulo(); //// cria apenas uma vez
        }
        return circulo; // retorna sempre a mesma instância
    }


    //Método de acesso Singleton para Triângulos por tipo
    public static Triangulo obterTriangulo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "isosceles":
                if (trianguloIsosceles == null) {
                    trianguloIsosceles = new Triangulo("Isósceles"); //// cria uma única vez
                }
                return trianguloIsosceles;

            case "equilatero":
                if (trianguloEquilatero == null) {
                    trianguloEquilatero = new Triangulo("Equilátero"); // cria uma única vez
                }
                return trianguloEquilatero;

            case "retangulo":
                if (trianguloRetangulo == null) {
                    trianguloRetangulo = new Triangulo("Retângulo"); // cria uma única vez
                }
                return trianguloRetangulo;

            default:
                throw new IllegalArgumentException("Tipo de triângulo inválido: " + tipo);
        }
    }

    //Não é Singleton: cada chamada cria um novo Quadrado
    public static Quadrado criarQuadrado() {
        return new Quadrado(); // retorna sempre uma nova instância
    }
}