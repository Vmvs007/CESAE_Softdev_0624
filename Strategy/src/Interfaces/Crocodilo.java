package Interfaces;

public class Crocodilo extends Animal implements Aquatico,Terrestre{
    public Crocodilo(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void nadar() {

    }

    @Override
    public void saltarAgua() {

    }

    @Override
    public void andar() {

    }

    @Override
    public void correr() {

    }
}
