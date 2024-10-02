package Ex_03;

public class ShippingCalculator {
    private ShippingStrategy shippingStrategyAtual;

    public ShippingCalculator(ShippingStrategy shippingStrategyAtual) {
        this.shippingStrategyAtual = shippingStrategyAtual;
    }

    public double calculateShippingCost(double weight){
        return shippingStrategyAtual.calculateShippingCost(weight);
    }

    public void setShippingStrategyAtual(ShippingStrategy shippingStrategyAtual) {
        this.shippingStrategyAtual = shippingStrategyAtual;
    }
}
