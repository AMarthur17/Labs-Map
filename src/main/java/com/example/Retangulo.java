package com.example;

public class Retangulo implements Figura {
    private double largura, altura;

    public Retangulo(double largura, double altura) {
        if (largura < 0 || altura < 0) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }
        this.largura = largura;
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
        return visitante.visitarRetangulo(this);
    }
}
