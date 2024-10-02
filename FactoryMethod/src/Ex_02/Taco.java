package Ex_02;

public abstract class Taco {
    private double preco;

    public Taco(double preco) {
        this.preco = preco;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void box();
}
