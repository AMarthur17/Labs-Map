package com.example;

public class VisitanteMaximiza implements Visitante {
    @Override
    public String visitarCirculo(Circulo c) {
        double raioBefore = c.getRaio();
        c.setRaio(c.getRaio() * 2);
        return "Raio antigo do círculo: " + raioBefore + "\nNovo raio do círculo: " + c.getRaio();
    }

    @Override
    public String visitarTriangulo(Triangulo t) {
        String resultado = "Triângulo antes: base " + t.getBase() + ", altura " + t.getAltura();
        t.setBase(t.getBase() * 2);
        t.setAltura(t.getAltura() * 2);
        return resultado + "\nTriângulo maximizado: base " + t.getBase() + ", altura " + t.getAltura();
    }

    @Override
    public String visitarRetangulo(Retangulo r) {
        String resultado = "Retângulo antes: largura " + r.getLargura() + ", altura " + r.getAltura();
        r.setLargura(r.getLargura() * 2);
        r.setAltura(r.getAltura() * 2);
        return resultado + "\nRetângulo maximizado: largura " + r.getLargura() + ", altura " + r.getAltura();
    }

    @Override
    public String visitarTrapezio(Trapezio t) {
        String resultado = "Trapézio antes: base maior " + t.getBaseMaior() + ", base menor " + t.getBaseMenor() + ", altura " + t.getAltura();
        t.setBaseMaior(t.getBaseMaior() * 2);
        t.setBaseMenor(t.getBaseMenor() * 2);
        t.setAltura(t.getAltura() * 2);
        return resultado + "\nTrapézio maximizado: base maior " + t.getBaseMaior() + ", base menor " + t.getBaseMenor() + ", altura " + t.getAltura();
    }
}
