package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> listaParticipantes;

    public Sorteio(double premio) {
        this.premio = premio;
        this.listaParticipantes = new ArrayList<Pessoa>();
    }

    public void addParticipante(Pessoa participanteNovo) {

        if (participanteNovo.getIdade() >= 18) {
            System.out.println("Inscrito com sucesso: " + participanteNovo.getNome());
            this.listaParticipantes.add(participanteNovo);
        } else {
            System.out.println("Não é possível inscrever " + participanteNovo.getNome() + " pois tem menos de 18 anos.");
        }
    }

    public Pessoa sortear() {
        Random rd = new Random();

        int indexSorteado = rd.nextInt(this.listaParticipantes.size());

        return this.listaParticipantes.get(indexSorteado);
    }


    public void exibirDetalhes() {
        System.out.println("***** Lista de Participantes *****");
        for (int i = 0; i < this.listaParticipantes.size(); i++) {
            System.out.print("Participante " + (i + 1) + " - ");
            this.listaParticipantes.get(i).exibirDetalhes();
        }
    }

    public void exibirDetalhesForEach() {
        System.out.println("***** Lista de Participantes *****");
        for (Pessoa pessoaAtual : this.listaParticipantes) {
            pessoaAtual.exibirDetalhes();
        }
    }
}
