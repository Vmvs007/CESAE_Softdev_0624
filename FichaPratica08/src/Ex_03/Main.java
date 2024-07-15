package Ex_03;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo(10, 20);
        Retangulo terreno = new Retangulo(100, 50);

        System.out.println("Perímetro: " + retangulo1.perimetro() + " m");
        System.out.println("Área: " + retangulo1.area() + " m2");

        System.out.println("__________________________________________");

        System.out.println("Perímetro: " + terreno.perimetro() + " m");
        System.out.println("Área: " + terreno.area() + " m2");
    }
}
