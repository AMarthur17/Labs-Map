package com.example;

public class Trapezio implements Figura {
    private double baseMaior, baseMenor, altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        if (baseMaior < 0 || baseMenor < 0 || altura < 0) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        if (baseMaior < 0) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        if (baseMenor < 0) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }
        this.baseMenor = baseMenor;
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
        return visitante.visitarTrapezio(this);
    }
}
