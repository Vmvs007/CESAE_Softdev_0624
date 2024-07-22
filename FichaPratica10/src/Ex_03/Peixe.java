package Ex_03;

public class Peixe {
    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Método construtor para <b>Peixe</b>
     *
     * @param especie Espécido do <b>Peixe</b>
     * @param peso    Peso em Kg.
     * @param precoKg Preço por Kg. em €
     */
    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    /**
     * Método para imprimir na consola as especificações do Peixe
     */
    public void exibirDetalhes() {
        System.out.println("\uD83D\uDC1F Espécie: " + this.especie + " | Peso: " + this.peso + " Kg. | Preço por Kg.: " + this.precoKg + " €");
    }
}
