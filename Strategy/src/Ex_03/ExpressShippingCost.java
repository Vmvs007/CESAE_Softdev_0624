package Ex_03;

public class ExpressShippingCost implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight) {
        return weight*10;
    }
}
