package com.example;

public class Main {
    public static void main(String[] args) throws Exception {

        FacadeManipulaFiguras fachada = new FacadeManipulaFiguras();
        try {
            // Criando figuras e adicionando figuras na fachada
            System.out.println(fachada.adicionarFigura(new Circulo(5)));
            System.out.println(fachada.adicionarFigura(new Triangulo(3, 4)));
            System.out.println(fachada.adicionarFigura(new Retangulo(2, 6)));
            System.out.println(fachada.adicionarFigura(new Trapezio(5, 3, 4)));
            // Realizando operações através da fachada
            System.out.println(fachada.desenharFiguras());
            System.out.println(fachada.calcularAreas());
            System.out.println(fachada.maximizarFiguras());
        } catch (Exception e) {
            System.out.println("Erro de sistema: " + e);
        }

    }
}

