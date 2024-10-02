package Controllers;

import Model.Sale;
import Repositories.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {

    private SalesRepository salesRepository;

    public AdminController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

    public double totalSales(){
        double totalSales=0;

        for(Sale saleAtual : salesRepository.getSalesArray()){
            totalSales+=saleAtual.getQuantity()*saleAtual.getPrice();
        }

        return totalSales;
    }

    public double averageSales(){
        return this.totalSales()/salesRepository.getSalesArray().size();
    }
}
