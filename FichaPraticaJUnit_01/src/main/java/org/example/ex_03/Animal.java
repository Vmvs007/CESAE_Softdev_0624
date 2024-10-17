package org.example.ex_03;

public class Animal {
    private String nome;
    private boolean comFome;
    private Alimento tipoAlimentacao;

    public Animal(String nome, Alimento tipoAlimentacao) {
        this.nome = nome;
        this.comFome = true;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getNome() {
        return nome;
    }

    public boolean estaComFome() {
        return comFome;
    }

    public Alimento getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void comer(Alimento comida) {
        if (tipoAlimentacao == comida) {
            comFome = false;
            System.out.println(nome + " comeu " + comida + ".");
        } else {
            System.out.println(nome + " nao come " + comida + ".");
        }
    }

}