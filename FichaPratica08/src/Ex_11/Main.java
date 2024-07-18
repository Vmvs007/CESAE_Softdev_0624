package Ex_11;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("12345", "Vitor Santos", 1000);
        Conta conta2 = new Conta("11122", "Joaquim A.", 300);
        Conta conta3 = new Conta("991122", "Joana S.", 500);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        conta1.depositar(250);
        conta3.depositar(120);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        conta1.levantar(750);
        conta2.levantar(2500);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        conta1.transferir(100, conta2);
        conta3.transferir(3000,conta1);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
    }
}
