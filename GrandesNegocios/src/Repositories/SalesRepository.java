package Repositories;

import Model.Sale;
import Tools.CsvSalesReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {
    private ArrayList<Sale> salesArray;

    public SalesRepository() throws FileNotFoundException {
        this.salesArray = CsvSalesReader.readCsvFileToSalesArray("Files/minimercado.csv");
    }

    public ArrayList<Sale> getSalesArray() {
        return salesArray;
    }
}
