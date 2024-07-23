package AirplaneStore;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> listaAvioes;

    public Catalogo() {
        this.listaAvioes= new ArrayList<Aviao>();
    }

    public void comprarAviao(Aviao aviaoNovo){
        this.listaAvioes.add(aviaoNovo);
    }

    public void venderAviao(Aviao aviaoVendido){
        this.listaAvioes.remove(aviaoVendido);
    }

    public void exibirCatalogo(){
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-* Catálogo Aviões *-*-*-*-*-*-*-*-*-*-*-*");
        for(Aviao aviaoAtual : this.listaAvioes){

            if(aviaoAtual instanceof JatoParticular){
                JatoParticular jp = (JatoParticular) aviaoAtual;
                jp.exibirDetalhesJato();
            }

            if(aviaoAtual instanceof AviaoCombate){
                AviaoCombate ac = (AviaoCombate) aviaoAtual;
                ac.exibirDetalhesAviaoCombate();

            }
        }
    }
}
