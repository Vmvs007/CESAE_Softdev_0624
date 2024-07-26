package AirplaneStore;

import java.util.ArrayList;

public class JatoParticular extends Aviao {
    private int lotacao;
    private double capBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> instalacoes;

    public JatoParticular(String numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altCauda, int nMotores, double autonomia, double velMax, double preco, int lotacao, double capBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, altCauda, nMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capBagagem = capBagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacao>();
    }

    public void addInstalacao(Instalacao instalacaoNova) {
        this.instalacoes.add(instalacaoNova);
    }

    public void removeInstalacao(Instalacao instalacaoRemover) {
        this.instalacoes.remove(instalacaoRemover);
    }

    public void exibirInstalacoes() {
        System.out.print("Instalações: ");
        System.out.println(this.instalacoes);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Lotação: " + this.lotacao + " | Cap. Bagagem: " + this.capBagagem + " cm3 | Categoria: " + this.categoria);
        this.exibirInstalacoes();
    }

}
