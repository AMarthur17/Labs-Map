package lab4;

class FigurasGeometricas {
    private Quadrado quadrado;
    private Circulo circulo;
    private Retangulo retangulo;

    public FigurasGeometricas(int alturaRetangulo, int larguraRetangulo, int ladoQuadrado, int raioCirculo) {
        this.quadrado = new Quadrado(ladoQuadrado);
        this.circulo = new Circulo(raioCirculo);
        this.retangulo = new Retangulo(alturaRetangulo, larguraRetangulo);
    }

    public Quadrado getQuadrado() {
        return quadrado;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public Retangulo getRetangulo() {
        return retangulo;
    }

  
    public String toString() {
        return "O retângulo criado tem altura: " + this.retangulo.getAltura() + " e largura de: " + this.retangulo.getLargura() + ".\n" +
               "O quadrado criado tem lados de: " + this.quadrado.getLado() + ".\n" +
               "O círculo criado tem raio de: " + this.circulo.getRaio() + ".";
    }
}
