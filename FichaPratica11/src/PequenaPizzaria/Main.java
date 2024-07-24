package PequenaPizzaria;

import PequenaPizzaria.Enums.TamanhoPizza;
import PequenaPizzaria.Enums.UnidadeMedida;

public class Main {
    public static void main(String[] args) {

        Ingrediente molhoTomate = new Ingrediente(50, "Molho Tomate", UnidadeMedida.LITROS, 150);
        Ingrediente azeitonaPreta = new Ingrediente(51, "Azeitona Preta", UnidadeMedida.UNIDADES, 1.5);
        Ingrediente queijoMozzarela = new Ingrediente(60, "Queijo Mozzarela Italiano", UnidadeMedida.GRAMAS, 2);
        Ingrediente cogumelosFrescos = new Ingrediente(53, "Cogumelos Frescos", UnidadeMedida.UNIDADES, 2.5);
        Ingrediente pepperoni = new Ingrediente(57, "Pepperoni", UnidadeMedida.UNIDADES, 10);
        Ingrediente cebolaRoxa = new Ingrediente(59, "Cebola Roxa", UnidadeMedida.GRAMAS, 0.5);

        Pizza pizza4EstacoesGrande = new Pizza(1,"Pizza 4 Estações","Inverno, Primavera, Verão, Outono",15, TamanhoPizza.GRANDE);
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(molhoTomate,0.2));
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(azeitonaPreta,20));
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(queijoMozzarela,200));
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(cogumelosFrescos,12));
        pizza4EstacoesGrande.addIngredientePizza(new IngredientePizza(pepperoni,6));


        Pizza pizzaQueijoFiambreMedia = new Pizza(2,"Pizza Fiambre e Queijo","Básico não falha",8,TamanhoPizza.MEDIA);
        pizzaQueijoFiambreMedia.addIngredientePizza(new IngredientePizza(molhoTomate,0.12));
        pizzaQueijoFiambreMedia.addIngredientePizza(new IngredientePizza(queijoMozzarela,150));


    }
}
