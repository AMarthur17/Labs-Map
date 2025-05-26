package com.example;

public class Triangulo implements Figura {
    private double base, altura;

    public Triangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }
        this.altura = altura;
    }

    @Override
    public String aceitar(Visitante visitante) {
        return visitante.visitarTriangulo(this);
    }
}
