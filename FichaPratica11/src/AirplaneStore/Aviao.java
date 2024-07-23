package AirplaneStore;

public class Aviao {
    private String numSerie;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double compFuselagem;
    private double envAsas;
    private double altCauda;
    private int nMotores;
    private double autonomia;
    private double velMax;
    private double preco;

    public Aviao(String numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int nMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFuselagem = compFuselagem;
        this.envAsas = envAsas;
        this.altCauda = altCauda;
        this.nMotores = nMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("\n***** " + this.modelo + " " + this.numSerie + " *****");
        System.out.println("Dimensões - Comp. Fuselagem: " + this.compFuselagem + " m. | Env. Asas: " + this.envAsas + " m. | Alt. Cauda: " + this.altCauda + " m. | Peso: " + this.peso + " Kg.");
        System.out.println("Ano Fabrico: " + this.anoFabrico + " | Num. Motores: " + this.nMotores + " | Vel. Max: " + this.velMax + " Km/h");
        System.out.println("Preço: " + this.preco + " €");
    }
}
