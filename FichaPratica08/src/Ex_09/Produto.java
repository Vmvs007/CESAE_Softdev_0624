package Ex_09;

public class Produto {
    private String nome;
    private double preco;
    private int quantStock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void comprar(int quantidadeCompra) {
        this.quantStock += quantidadeCompra; // this.quantStock = this.quantStock + quantidadeCompra;
    }

    public void vender(int quantidadeVenda) {
        if (this.quantStock >= quantidadeVenda) {
            // Venda com sucesso
            this.quantStock-=quantidadeVenda;
        }else{
            System.out.println("Stock Indisponível");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + this.nome + "\t|\tPreço: " + this.preco + "\t|\tQuant. Stock: " + this.quantStock);
    }
}
