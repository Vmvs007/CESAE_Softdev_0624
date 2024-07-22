package Ex_06;


public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] listaParticipantes;

    /**
     * Método construtor para uma Competição
     *
     * @param nome         Nome da Competição
     * @param pais         País onde decorre
     * @param maxInscritos Máximo de Inscritos
     */
    public Competicao(String nome, String pais, int maxInscritos) {
        this.nome = nome;
        this.pais = pais;
        this.listaParticipantes = new Atleta[maxInscritos];
    }

    /**
     * Método construtor para uma Competição - maxInscritos a 5000
     *
     * @param nome Nome da Competição
     * @param pais País onde decorre
     */
    public Competicao(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.listaParticipantes = new Atleta[5000];
    }


    public void addAtleta(Atleta atletaNovo) {
        for (int i = 0; i < this.listaParticipantes.length; i++) {
            if (this.listaParticipantes[i] == null) {
                this.listaParticipantes[i] = atletaNovo;
                return;
            }
        }
    }

    public void exibirDetalhes() {
        System.out.println("***** " + this.nome + " em " + this.pais + " *****");

        for (int i = 0; i < this.listaParticipantes.length && this.listaParticipantes[i] != null; i++) {
            this.listaParticipantes[i].exibirDetalhes();
        }
        System.out.println("*********************************\n");
    }


}
