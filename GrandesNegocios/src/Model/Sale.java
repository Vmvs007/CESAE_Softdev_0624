package Model;

public class Sale {
    private String productType;
    private String productName;
    private double quantity;
    private double price;

    public Sale(String productType, String productName, double quantity, double price) {
        this.productType = productType;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
