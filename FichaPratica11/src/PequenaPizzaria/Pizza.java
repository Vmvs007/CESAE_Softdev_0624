package PequenaPizzaria;

import PequenaPizzaria.Enums.TamanhoPizza;
import PequenaPizzaria.Ingredientes.Base;
import PequenaPizzaria.Ingredientes.Topping;

import java.util.ArrayList;

public class Pizza {
    private final int MAX_INGREDIENTES = 5;
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> listaIngredientes;

    public Pizza(int id, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.listaIngredientes = new ArrayList<IngredientePizza>();
    }

    /**
     * Método para adicionar um novo <b>IngredientePizza</b> à <b>listaIngredientes</b>
     *
     * @param ingredientePizzaNovo <b>IngredientePizza</b> a ser adicionado
     */
    public void addIngredientePizza(IngredientePizza ingredientePizzaNovo) {

        if (this.listaIngredientes.isEmpty()) { // Ainda não temos nenhum IngredientePizza

            if (ingredientePizzaNovo.getIngrediente() instanceof Base) { // Só convém adicionar Base
                this.listaIngredientes.add(ingredientePizzaNovo);
            }

        } else { // Já temos, pelo menos um IngredientePizza

            if (ingredientePizzaNovo.getIngrediente() instanceof Topping && this.listaIngredientes.size() < MAX_INGREDIENTES) { // Só convém adicionar Toppings, até chegar a um max de 5 ingredientes
                this.listaIngredientes.add(ingredientePizzaNovo);
            }

        }

    }

    /**
     * Método para remover um <b>IngredientePizza</b> através do seu <b>id</b>
     *
     * @param idRemover id do <b>IngredientePizza</b> a remover
     */
    public void removeIngredientePizza(int idRemover) {
        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            if (ingredientePizzaAtual.getIngrediente().getId() == idRemover) {
                this.listaIngredientes.remove(ingredientePizzaAtual);
                return;
            }
        }
    }

    /**
     * Método para alterar a quantidade deu um <b>IngredientePizza</b> através do seu <b>id</b>
     *
     * @param idRemover      id do <b>IngredientePizza</b> cuja quantidade vai ser alterada
     * @param novaQuantidade nova quantidade do <b>IngredientePizza</b>
     */
    public void alterarQuantidadeIngredientePizza(int idRemover, double novaQuantidade) {
        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            if (ingredientePizzaAtual.getIngrediente().getId() == idRemover) {
                ingredientePizzaAtual.setQuantidade(novaQuantidade);
                return;
            }
        }
    }

    public double caloriasTotais() {
        double caloriasTotaisPizza = 0;

        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            caloriasTotaisPizza += ingredientePizzaAtual.getQuantidade() * ingredientePizzaAtual.getIngrediente().getCalorias();
        }

        return caloriasTotaisPizza;
    }

    public void exibirDetalhesPizza() {
        System.out.println("******** " + this.nome + " ********");
        System.out.println("Código: " + this.id);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + " €");
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Kcal. Totais: " + this.caloriasTotais() + " Kcal.");

        System.out.println("___ Lista de Ingredientes ___");
        int cont = 1;
        for (IngredientePizza ingredientePizzaAtual : this.listaIngredientes) {
            System.out.print("Ingrediente " + cont++ + ": ");
            ingredientePizzaAtual.exibirDetalhesIngredientePizza();
            System.out.println();
        }


    }


}
