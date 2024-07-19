package Ex_05;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String telemovel;

    public Pessoa(String nome, int idade, String email, String telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + " | Idade: " + this.idade + " anos | Email: " + this.email + " | Telem.: " + this.telemovel);
    }
}
