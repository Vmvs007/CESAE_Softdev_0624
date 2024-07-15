package Ex_01;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    /**
     * Método construtor para Pessoa
     *
     * @param nome   Nome Civil
     * @param idade  Idade
     * @param altura Altura (m.)
     */
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }
}
