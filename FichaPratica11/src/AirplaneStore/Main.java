package AirplaneStore;

public class Main {
    public static void main(String[] args) {

        JatoParticular cessna = new JatoParticular("J12345", "Cessna 125", 1990, 850, 12.5, 6.75, 2.3, 2, 2300, 755, 50980, 12, 300, CategoriaJato.MIDSIZE_JET);
        cessna.addInstalacao(Instalacao.WC);
        cessna.addInstalacao(Instalacao.WC);
        cessna.addInstalacao(Instalacao.TOMADAS);
        cessna.addInstalacao(Instalacao.WIFI);

        JatoParticular gulfstream = new JatoParticular("G222334", "Gulfstream FBB", 2023, 1200, 19.9, 7, 3.1, 3, 2900, 980, 78900, 18, 450, CategoriaJato.HEAVY_JET);
        gulfstream.addInstalacao(Instalacao.WC);
        gulfstream.addInstalacao(Instalacao.WIFI);
        gulfstream.addInstalacao(Instalacao.TOMADAS);
        gulfstream.addInstalacao(Instalacao.COZINHA);
        gulfstream.addInstalacao(Instalacao.SUITE);

        JatoParticular boeing = new JatoParticular("BoeingRGH12", "Boeing 747", 2018, 3800, 25, 15.5, 4.2, 4, 3500, 891, 88123, 50, 1000, CategoriaJato.HEAVY_JET);
        boeing.addInstalacao(Instalacao.WC);
        boeing.addInstalacao(Instalacao.WC);
        boeing.addInstalacao(Instalacao.WIFI);
        boeing.addInstalacao(Instalacao.ESCRITORIO);

        AviaoCombate f17 = new AviaoCombate("US007", "F17", 2012, 450, 6.8, 3.75, 1.2, 2, 1650, 1230, 98500, "Estados Unidos", true);
        f17.addArma(Arma.METRALHADORAS);
        f17.addArma(Arma.FOGUETES);
        f17.addArma(Arma.MISSEIS);
        f17.addArma(Arma.BOMBAS);

        AviaoCombate f22 = new AviaoCombate("US210", "F22", 2020, 500, 7, 4, 1.5, 3, 2200, 1390, 99000, "Estados Unidos", false);
        f22.addArma(Arma.BOMBAS);

        Catalogo lojaAvioesXPTO = new Catalogo();
        lojaAvioesXPTO.comprarAviao(cessna);
        lojaAvioesXPTO.comprarAviao(gulfstream);
        lojaAvioesXPTO.comprarAviao(boeing);
        lojaAvioesXPTO.comprarAviao(f17);
        lojaAvioesXPTO.comprarAviao(f22);

        lojaAvioesXPTO.exibirCatalogo();

    }
}
