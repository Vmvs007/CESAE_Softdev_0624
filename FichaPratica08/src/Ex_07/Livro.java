package Ex_07;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int nPaginas;
    private String isbn;

    public Livro(String titulo, String autor, String categoria, int nPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.nPaginas = nPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println("***** " + this.isbn + " *****");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Núm. Páginas: " + this.nPaginas);
    }
}
