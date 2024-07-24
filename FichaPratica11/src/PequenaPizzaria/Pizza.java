package PequenaPizzaria;

import PequenaPizzaria.Enums.TamanhoPizza;

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

    public void addIngredientePizza(IngredientePizza ingredientePizzaNovo) {
        if (this.listaIngredientes.size() < this.MAX_INGREDIENTES) {
            this.listaIngredientes.add(ingredientePizzaNovo);
        }
    }


}
