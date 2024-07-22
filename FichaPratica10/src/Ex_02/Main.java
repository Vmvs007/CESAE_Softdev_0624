package Ex_02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor S.",24,"911 222 333","vitor@gmail.com");
        Pessoa pessoa2 = new Pessoa("Joana T.",15,"922 333 444","joana@gmail.com");
        Pessoa pessoa3 = new Pessoa("Joaquim A.",44,"933 444 555","quim@gmail.com");
        Pessoa pessoa4 = new Pessoa("Ana S.",19,"921 456 678","ana@gmail.com");
        Pessoa pessoa5 = new Pessoa("Manuel F.",38,"988 777 566","manuel@gmail.com");

        Sorteio cabazNatal = new Sorteio(5000);

        cabazNatal.addParticipante(pessoa1);
        cabazNatal.addParticipante(pessoa2);
        cabazNatal.addParticipante(pessoa3);
        cabazNatal.addParticipante(pessoa4);
        cabazNatal.addParticipante(pessoa5);

        System.out.println();
        cabazNatal.exibirDetalhes();

        // cabazNatal.exibirDetalhesForEach();

        System.out.println("\n********** Vencedor **********");
        cabazNatal.sortear().exibirDetalhes();

    }
}
