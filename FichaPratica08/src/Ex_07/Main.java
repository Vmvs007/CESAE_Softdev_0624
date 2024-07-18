package Ex_07;

public class Main {
    public static void main(String[] args) {

        Livro headsFirstJava = new Livro("Heads First Java", "Vitor S.", "Programação", 750, "123456789");
        Livro biblia = new Livro("Bíblia", "Jesus", "Religião", 900, "1");

        headsFirstJava.exibirDetalhes();
        System.out.println();
        biblia.exibirDetalhes();
    }
}
