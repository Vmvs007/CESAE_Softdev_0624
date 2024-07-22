package Ex_01;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("The Scientist","Rock Alternativo","Coldplay",3700);
        Musica musica2 = new Musica("Bohemian Rapsody","Rock","Queen",7000);
        Musica musica3 = new Musica("Mestre da Culinária","Heavy Metal","Quim Barreiros",60);

        MusicPlayer mp = new MusicPlayer();

        mp.addMusica(musica1);
        mp.addMusica(musica2);
        mp.addMusica(musica3);

        mp.imprimirRelatorio();

        System.out.println("______________________________________");

        mp.trocarMusica(0,2);

        mp.imprimirRelatorio();

        System.out.println("______________________________________");
        mp.calcularDuracao();
    }
}
