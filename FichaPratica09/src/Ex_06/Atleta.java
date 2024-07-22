package Ex_06;

public class Atleta {
    private String nome;
    private String desporto;
    private double altura;
    private double peso;
    private String pais;

    public Atleta(String nome, String desporto, double altura, double peso, String pais) {
        this.nome = nome;
        this.desporto = desporto;
        this.altura = altura;
        this.peso = peso;
        this.pais = pais;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + " | Desporto: " + this.desporto + " | Altura: " + this.altura + " m. | Peso: " + this.peso + " Kg. | País: " + this.pais);
    }
}
