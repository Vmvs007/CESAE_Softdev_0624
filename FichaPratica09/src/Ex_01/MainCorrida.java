package Ex_01;

public class MainCorrida {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Mercedes","a45",2020,420,2000,TipoCombustivel.GASOLINA,18);
        Carro carro2 = new Carro("BMW","116d",2015,110,1500,TipoCombustivel.DIESEL,8);
        Carro carro3 = new Carro("Papa","Reformas",2000,25,500,TipoCombustivel.GPL,22);
        Carro carro4 = new Carro("Ferrari","SF900",2020,800,5000,TipoCombustivel.GASOLINA,30);

        Carro vencedorCorrida1 = carro1.corrida(carro2);
        Carro vencedorCorrida2 = carro3.corrida(carro4);

        Carro vencedorFinal = vencedorCorrida1.corrida(vencedorCorrida2);

        vencedorFinal.exibirDetalhes();



    }
}
