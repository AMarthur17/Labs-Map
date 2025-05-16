package edu.uepb.cct.cc;

public class Triangulo implements Figura {
    private final String tipo;

    public Triangulo(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de triângulo não pode ser nulo.");
        }
        this.tipo = tipo;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Triângulo " + tipo + ".");
    }
}

