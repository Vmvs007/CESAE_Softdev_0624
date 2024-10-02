package Ex_03;

public class StandardShippingStrategy implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight) {
        return weight*5;
    }
}
