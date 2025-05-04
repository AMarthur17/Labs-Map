package lab4;

public class Quadrado extends FiguraGeometrica {
    private int lado;

    public Quadrado(int lado) {
        if (lado <= 0) {
            throw new ValorInvalidoException("O lado do quadrado deve ser maior que zero.");
        }
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Quadrado com lado: " + lado + 
               ", área: " + calcularArea() + 
               ", perímetro: " + calcularPerimetro();
    }
}
