package Ex_01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracaoSegundos;

    /**
     * Método construtor de Música
     * @param titulo Título da Música
     * @param genero Género da Música
     * @param artista Artista da Música
     * @param duracaoSegundos Duração em segundos
     */
    public Musica(String titulo, String genero, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo + " | Género: " + this.genero + " | Artista: " + this.artista + " | Duração: " + this.duracaoSegundos + " s.");
    }
}
