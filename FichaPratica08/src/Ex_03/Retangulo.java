package Ex_03;

public class Retangulo {
    private int largura;
    private int comprimento;

    /**
     * Método Construtor para Retângulo
     *
     * @param largura     Largura (m.)
     * @param comprimento Comprimento (m.)
     */
    public Retangulo(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public int area() {
        return this.comprimento * this.largura;
    }

    public int perimetro() {
        return this.comprimento + this.comprimento + this.largura + this.largura;
    }


}
