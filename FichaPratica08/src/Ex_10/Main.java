package Ex_10;

public class Main {
    public static void main(String[] args) {
        Funcionario vitor = new Funcionario("Vitor Santos","Formação",2000);
        vitor.exibirDetalhes();

        vitor.aumentarSalario(20);

        vitor.exibirDetalhes();
    }
}
