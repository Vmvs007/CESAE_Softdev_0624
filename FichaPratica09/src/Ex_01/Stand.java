package Ex_01;

public class Stand {
    private String nome;
    private String localizacao;
    private Carro[] catalogo;

    public Stand(String nome, String localizacao, int capacidade) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.catalogo = new Carro[capacidade];
    }

    public void addCarro(Carro carroNovo) {

        for (int i = 0; i < this.catalogo.length; i++) {
            if (this.catalogo[i] == null) {
                this.catalogo[i] = carroNovo;
                return;
            }
        }

    }

    public void imprimirCatalogo() {
        System.out.println("*-*-*-*-* " + this.nome + " da " + this.localizacao + " *-*-*-*-*");

        for (int i = 0; i < this.catalogo.length && this.catalogo[i] != null; i++) {
            this.catalogo[i].exibirDetalhes();
        }
    }


}
