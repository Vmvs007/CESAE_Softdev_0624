package Interfaces;

public class Cao extends Animal implements Terrestre {

    public Cao(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void andar() {
        System.out.println("O Cão está a andar");
    }

    @Override
    public void correr() {
        System.out.println("O Cão está a correr");
    }
}
