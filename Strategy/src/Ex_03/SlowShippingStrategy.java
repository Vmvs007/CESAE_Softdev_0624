package Ex_03;

public class SlowShippingStrategy implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight) {
        return weight*2+1.5;
    }
}
