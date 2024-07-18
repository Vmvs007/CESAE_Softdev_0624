package Ex_09;

public class Main {
    public static void main(String[] args) {
        Produto lapis = new Produto("Lápis HB",0.4);
        lapis.exibirDetalhes();

        lapis.comprar(150);
        lapis.exibirDetalhes();

        lapis.vender(50);
        lapis.exibirDetalhes();

        lapis.vender(200);
        lapis.exibirDetalhes();

    }
}
