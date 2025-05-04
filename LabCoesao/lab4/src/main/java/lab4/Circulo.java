package lab4;

public class Circulo extends FiguraGeometrica {
    private int raio;

    
    public Circulo(int raio) {
        if (raio <= 0) {
            throw new ValorInvalidoException("O raio deve ser maior que 0");
        }
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Círculo com raio: " + raio + 
               ", área: " + calcularArea() + 
               ", perímetro: " + calcularPerimetro();
    }
}
