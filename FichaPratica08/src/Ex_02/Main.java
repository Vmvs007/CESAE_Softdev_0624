package Ex_02;

public class Main {
    public static void main(String[] args) {

        Cao rex = new Cao("Rex",Racas.CARAMELO);
        Cao max = new Cao("Max", Racas.BULLDOG);

        rex.ladrar();
        max.ladrar();

        System.out.println("__________________________________");

        rex.setLatido("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");

        rex.ladrar();
        max.ladrar();

    }
}
