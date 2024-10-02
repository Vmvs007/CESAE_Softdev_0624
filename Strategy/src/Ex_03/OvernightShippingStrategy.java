package Ex_03;

public class OvernightShippingStrategy implements ShippingStrategy{

    @Override
    public double calculateShippingCost(double weight) {
        return weight*15;
    }
}
