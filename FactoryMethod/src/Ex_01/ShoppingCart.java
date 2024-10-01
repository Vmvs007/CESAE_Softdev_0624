package Ex_01;

import java.util.ArrayList;

public class ShoppingCart {
    private String user;
    private ArrayList<Product> cart;

    public ShoppingCart(String user) {
        this.user = user;
        this.cart = new ArrayList<>();
    }

    public void addProduto(Product newProduct) {
        this.cart.add(newProduct);
    }

    public void printCart(){
        System.out.println("_____ "+this.user +"'s Cart _____");
        for (Product productAtual : this.cart) {

            productAtual.display();
        }
    }

    public double cartTotal() {
        double total = 0;
        for (Product productAtual : this.cart) {
            total += productAtual.getPrice();
        }
        return total;
    }
}
