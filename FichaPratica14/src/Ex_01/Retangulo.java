package Ex_01;

public class Retangulo extends FiguraGeometrica {
    private double comprimento;
    private double largura;

    public Retangulo(String cor, double comprimento, double largura) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double area() {
        return this.comprimento * this.largura;
    }

    @Override
    public double perimetro() {
        return 2 * (this.comprimento + this.largura);
    }

    @Override
    public String toString() {
        return "É um Retângulo com "+this.comprimento+" comprimento e "+this.largura+" largura";
    }
}
