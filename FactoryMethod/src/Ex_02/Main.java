package Ex_02;

public class Main {
    public static void main(String[] args) {

        Taco mexicanoPicante= TacoFactory.createTaco("vaca",10);
        Taco tacoHorta= TacoFactory.createTaco("vegetariano",12);

        mexicanoPicante.prepare();
        mexicanoPicante.bake();
        mexicanoPicante.box();

        tacoHorta.prepare();
        tacoHorta.bake();
        tacoHorta.box();

    }
}
