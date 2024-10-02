package Ex_03;

public class Main {
    public static void main(String[] args) {

        ShippingCalculator sc = new ShippingCalculator(new StandardShippingStrategy());

        double pesoEncomenda = 5;

        System.out.print("Portes para uma encomenda de "+pesoEncomenda+" Kg.: ");
        System.out.println(sc.calculateShippingCost(pesoEncomenda)+" €");

        System.out.println("\nMudança de Estratégia\n");
        sc.setShippingStrategyAtual(new ExpressShippingCost());

        System.out.print("Portes para uma encomenda de "+pesoEncomenda+" Kg.: ");
        System.out.println(sc.calculateShippingCost(pesoEncomenda)+" €");

        System.out.println("\nMudança de Estratégia\n");
        sc.setShippingStrategyAtual(new OvernightShippingStrategy());

        System.out.print("Portes para uma encomenda de "+pesoEncomenda+" Kg.: ");
        System.out.println(sc.calculateShippingCost(pesoEncomenda)+" €");

        System.out.println("\nMudança de Estratégia\n");
        sc.setShippingStrategyAtual(new SlowShippingStrategy());

        System.out.print("Portes para uma encomenda de "+pesoEncomenda+" Kg.: ");
        System.out.println(sc.calculateShippingCost(pesoEncomenda)+" €");

        pesoEncomenda=10;
        System.out.print("Portes para uma encomenda de "+pesoEncomenda+" Kg.: ");
        System.out.println(sc.calculateShippingCost(pesoEncomenda)+" €");


    }
}
