package Ex_03;

public class Main {
    public static void main(String[] args) {

        Animal max = new Animal("Max", "Cão", "Portugal", 28, new String[]{"Ração", "Bife"});
        max.exibirDetalhes();

        max.comer("bife",2000);
        max.exibirDetalhes();

        max.comer("cenouras",500);
        max.exibirDetalhes();


    }
}
