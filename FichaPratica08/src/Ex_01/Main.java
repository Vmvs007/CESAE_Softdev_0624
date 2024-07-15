package Ex_01;

public class Main {
    public static void main(String[] args) {

        Pessoa vitor = new Pessoa("Vitor", 24, 1.7);
        Pessoa ana = new Pessoa("Ana", 22, 1.6);

        System.out.println("**** Informações das Pessoas *****");
        System.out.println("Nome: " + vitor.getNome());
        System.out.println("Idade: " + vitor.getIdade() + " anos.");
        System.out.println("Altura: " + vitor.getAltura() + " m.");

        System.out.println("______________________________________");

        System.out.println("Nome: " + ana.getNome());
        System.out.println("Idade: " + ana.getIdade() + " anos.");
        System.out.println("Altura: " + ana.getAltura() + " m.");


    }
}
