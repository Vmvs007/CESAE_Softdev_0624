package Ex_02;

public class TacoFactory {
    public static Taco createTaco(String type, double price) {
        switch (type) {
            case "vaca":
                return new TacoCarne(price);
            case "frango":
                return new TacoFrango(price);
            case "vegetariano":
                return new TacoVegetariano(price);
            default:
                throw new IllegalArgumentException("Tipo de taco não está no menu: " + type);
        }
    }
}
