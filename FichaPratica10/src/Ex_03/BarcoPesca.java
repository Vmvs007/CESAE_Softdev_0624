package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marcaBarco;
    private ArrayList<Peixe> peixePescado;
    private ArrayList<Marisco> mariscoPescado;

    /**
     * Método construtor para <b>Barco</b>
     *
     * @param nome            Nome do <b>Barco</b>
     * @param cor             Cor do <b>Barco</b>
     * @param anoFabrico      Ano de Fabrico
     * @param tripulacao      Quantidade de Tripulação (exclui Capitão)
     * @param capacidadeCarga Capacidade da Carga em Kg.
     * @param marcaBarco      Marca do <b>Barco</b>
     */
    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, Marca marcaBarco) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marcaBarco = marcaBarco;
        this.peixePescado = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    /**
     * Método que calcular a carga atual do Barco
     *
     * @return Carga Atual em Kg.
     */
    public double calcularCargaAtual() {
        double cargaAtual = 0;

        for (Peixe peixeAtual : this.peixePescado) {
            cargaAtual += peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaAtual += mariscoAtual.getPeso();
        }

        return cargaAtual;
    }

    /**
     * Método para adicionar mais peixe, se couber
     *
     * @param peixeNovo Peixe a ser adicionado
     */
    public void addPeixe(Peixe peixeNovo) {
        if (this.calcularCargaAtual() + peixeNovo.getPeso() <= this.capacidadeCarga) {
            // Pode ser pescado
            this.peixePescado.add(peixeNovo);
        }
    }

    /**
     * Método para adicionar mais marisco, se couber
     *
     * @param mariscoNovo Marisco a ser adicionado
     */
    public void addMarisco(Marisco mariscoNovo) {
        if (this.calcularCargaAtual() + mariscoNovo.getPeso() <= this.capacidadeCarga) {
            // Pode ser pescado
            this.mariscoPescado.add(mariscoNovo);
        }
    }

    /**
     * Método para largar peixe (remover do array)
     * @param indexRemovido
     */
    public void largarPeixe(int indexRemovido) {
        this.peixePescado.remove(indexRemovido);
    }

    /**
     * Método para largar marisco (remover do array)
     * @param indexRemovido
     */
    public void largarMarisco(int indexRemovido) {
        this.mariscoPescado.remove(indexRemovido);
    }

    /**
     * Método que calcula o valor total da carga em €
     * @return Valor Total da Carga em €
     */
    public double valorTotal() {
        double valorTotal = 0;

        for (Peixe peixeAtual : this.peixePescado) {
            valorTotal += peixeAtual.getPeso() * peixeAtual.getPrecoKg();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            valorTotal += mariscoAtual.getPeso() * mariscoAtual.getPrecoKg();
        }

        return valorTotal;
    }

    /**
     * Método para exibir os detalhes do Barco de Pesca
     */
    public void exibirDetalhes() {
        System.out.println("***** " + this.nome + " *****");
        System.out.println("Capacidade Carga: " + this.capacidadeCarga + " Kg.");
        System.out.println("Carga Atual: " + this.calcularCargaAtual() + " Kg.");

        System.out.println("\nPeixe Pescado:");
        for (Peixe peixeAtual : this.peixePescado) {
            peixeAtual.exibirDetalhes();
        }

        System.out.println("\nMarisco Pescado:");
        for (Marisco mariscoAtual : this.mariscoPescado) {
            mariscoAtual.exibirDetalhes();
        }

        System.out.println("Valor Total da Carga: "+this.valorTotal()+" €");
    }

}
