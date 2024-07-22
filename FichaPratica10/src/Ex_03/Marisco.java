package Ex_03;

public class Marisco {
    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Método construtor para <b>Marisco</b>
     * @param especie Espécido do <b>Marisco</b>
     * @param peso Peso em Kg.
     * @param precoKg Preço por Kg. em €
     */
    public Marisco(String especie, double peso, double precoKg) {
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
     * Método para imprimir na consola as especificações do Marisco
     */
    public void exibirDetalhes() {
        System.out.println("\uD83E\uDD80 Espécie: " + this.especie + " | Peso: " + this.peso + " Kg. | Preço por Kg.: " + this.precoKg + " €");
    }
}
