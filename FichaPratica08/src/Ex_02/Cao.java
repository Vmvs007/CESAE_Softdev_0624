package Ex_02;

public class Cao {
    private String nome;
    private Racas raca;
    private String latido = "Au au au ";

    /**
     * Método Construtor para Cao
     * @param nome Nome do Cão
     * @param raca Raça do Cão
     */
    public Cao(String nome, Racas raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void ladrar() {
        System.out.println(this.latido);
    }

}
