package PequenaPizzaria;

import PequenaPizzaria.Enums.UnidadeMedida;

public class Ingrediente {
    private int id;
    private String nome;
    private UnidadeMedida unidadeMedida;
    private double calorias;

    public Ingrediente(int id, String nome, UnidadeMedida unidadeMedida, double calorias) {
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.calorias = calorias;
    }

}
