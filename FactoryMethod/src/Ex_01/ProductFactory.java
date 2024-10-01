package Ex_01;

public class ProductFactory {
    public static Product createProduct(String type, String name, double preco) {
        switch (type) {
            case "book":
                return new Book(name,preco);
            case "eletronics":
                return new Eletronics(name,preco);
            case "clothing":
                return new Clothing(name,preco);
            case "food":
                return new Food(name,preco);
            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido: " + type);
        }
    }
}
