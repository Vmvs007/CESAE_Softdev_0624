package Interfaces;

public class Golfinho extends Animal implements Aquatico{

    public Golfinho(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void nadar() {
        System.out.println("O Golfinho está a nadar");
    }

    @Override
    public void saltarAgua() {
        System.out.println("O Golfinho saltou da água");
    }
}
