package Ex_08;

public class Main {
    public static void main(String[] args) {

        Aluno vitor = new Aluno("Vitor S.", 24, "Informática", 17);
        Aluno quim = new Aluno("Joaquim", 35, "Arquitetura", 5.5);

        System.out.println("Situação do Vitor: " + vitor.situacao());
        System.out.println("Situação do Quim: " + quim.situacao());
    }
}
