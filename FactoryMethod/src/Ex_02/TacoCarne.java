package Ex_02;

public class TacoCarne extends Taco{

    public TacoCarne(double preco) {
        super(preco);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar taco de carne de vaca");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco de carne de vaca");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco de carne de vaca");
    }
}
