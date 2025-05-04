package lab4;

public class Retangulo extends FiguraGeometrica {
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        if (altura <= 0 || largura <= 0) {
            throw new ValorInvalidoException("A altura e a largura do retângulo devem ser maiores que zero.");
        }
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    @Override
    public String toString() {
        return "Retângulo com altura: " + altura + " e largura: " + largura + 
               ", área: " + calcularArea() + 
               ", perímetro: " + calcularPerimetro();
    }
}
