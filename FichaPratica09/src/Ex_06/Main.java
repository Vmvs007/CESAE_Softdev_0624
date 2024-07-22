package Ex_06;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Cristiano Ronaldo", "Futebol", 1.85, 70, "Portugal");
        Atleta atleta2 = new Atleta("Joaquim", "Natação", 1.9, 80, "Portugal");
        Atleta atleta3 = new Atleta("Conor Mc.", "Luta", 1.76, 78, "Irlanda");
        Atleta atleta4 = new Atleta("Joana S.", "Atletismo", 1.6, 58, "Espanha");

        Competicao maratonaPorto = new Competicao("Maratona Porto", "Portugal");
        maratonaPorto.addAtleta(atleta1);
        maratonaPorto.addAtleta(atleta2);
        maratonaPorto.addAtleta(atleta4);

        Competicao jogosOlimpicos = new Competicao("Jogos Olímpicos", "França", 100);
        jogosOlimpicos.addAtleta(atleta1);
        jogosOlimpicos.addAtleta(atleta3);

        maratonaPorto.exibirDetalhes();
        jogosOlimpicos.exibirDetalhes();

    }
}
