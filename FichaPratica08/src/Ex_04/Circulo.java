package Ex_04;

public class Circulo {
    private double raio;

    /**
     * Método Construtor de Círculo
     * @param raio raio (m.)
     */
    public Circulo(double raio) {
        this.raio = raio;
    }

    /**
     * Método que retorna a área do circulo
     * @return Área (m.2)
     */
    public double area() {
        return this.raio * this.raio * 3.14;
    }

    /**
     * Método que retorna a circunferencia do circulo
     * @return Circunferência (m.)
     */
    public double circunferencia() {
        return 2 * 3.14 * this.raio;
    }
}
