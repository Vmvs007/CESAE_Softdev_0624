package Ex_03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer(String alimento, double pesoG) {
        for (int i = 0; i < this.alimentacao.length; i++) {
            if (this.alimentacao[i].equalsIgnoreCase(alimento)) {
                // O animal gosta do alimento
                this.peso += pesoG / 1000;
                System.out.println("O animal comeu " + alimento);
                return;
            }
        }

        // O animal não comeu
        System.out.println("O animal não comeu " + alimento);
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + " | Espécie: " + this.especie + " | País: " + this.paisOrigem + " | Peso: " + this.peso + " Kg.");
    }

}
