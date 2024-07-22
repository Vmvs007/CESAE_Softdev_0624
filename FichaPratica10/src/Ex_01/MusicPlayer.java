package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {
    ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();
    }

    public void addMusica(Musica musicaNova) {
        this.programacao.add(musicaNova);
    }

    public void removerMusica(int indexRemover) {
        this.programacao.remove(indexRemover);
    }

    public void removerMusica(Musica musicaRemover) {
        this.programacao.remove(musicaRemover);
    }

    public void trocarMusica(int indexTrocar, Musica musicaNova) {
        this.programacao.set(indexTrocar, musicaNova);
    }

    public void trocarMusica(int index1, int index2) {
        Musica musicaAux = this.programacao.get(index1);

        this.programacao.set(index1, this.programacao.get(index2));
        this.programacao.set(index2, musicaAux);
    }

    public void trocarMusica(Musica musica1, Musica musica2) {

        if (this.programacao.contains(musica1) && this.programacao.contains(musica2)) {

            int indexMusica1 = this.programacao.indexOf(musica1);
            int indexMusica2 = this.programacao.indexOf(musica2);

            this.programacao.set(indexMusica1, musica2);
            this.programacao.set(indexMusica2, musica1);

        }

    }

    public void limparProgramacao() {
        this.programacao.clear();
    }

    public void calcularDuracao() {
        int totalSegundosAlbum = 0;

        for (Musica musicaAtual : this.programacao) {
            totalSegundosAlbum += musicaAtual.getDuracaoSegundos();
        }

        int horas, minutos, segundos;

        horas = totalSegundosAlbum / 3600;
        minutos = totalSegundosAlbum / 60 - (horas * 60);
        segundos = totalSegundosAlbum - (horas * 3600) - (minutos * 60);

        System.out.println("Duração: "+horas+":"+minutos+":"+segundos);
    }

    public void imprimirRelatorio() {
        for (int i = 0; i < this.programacao.size(); i++) {
            System.out.print("Música " + (i + 1) + " - ");
            this.programacao.get(i).exibirDetalhes();
        }
    }


}
