package Interfaces;

public class Animal {
    protected String nome;
    protected String cor;
    protected double peso;

    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public void apresentar() {
        System.out.println("Olá, sou o/a " + nome);
    }
}
