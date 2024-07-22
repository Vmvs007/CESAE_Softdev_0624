package Ex_03;

public class Main {
    public static void main(String[] args) {

        Peixe sardinhas = new Peixe("Sardinha", 100, 12);
        Peixe peixeEspada = new Peixe("Peixe Espada", 150, 50);
        Peixe dourada = new Peixe("Dourada", 70, 20);

        Marisco caranguejo = new Marisco("Caranguejo", 200, 100);
        Marisco ameijoa = new Marisco("Ameijoa", 50, 90);
        Marisco lagosta = new Marisco("Lagosta", 150, 200);

        BarcoPesca bp = new BarcoPesca("Santa Maria do Mar", "Branco", 1998, 4, 380, Marca.SAVER);

        bp.addPeixe(sardinhas);
        bp.addPeixe(peixeEspada);
        bp.addPeixe(dourada);

        bp.addMarisco(caranguejo);
        bp.addMarisco(ameijoa);
        bp.addMarisco(lagosta);

        bp.exibirDetalhes();

        bp.largarPeixe(0);
        bp.largarPeixe(1);

        bp.addMarisco(lagosta);

        System.out.println();
        bp.exibirDetalhes();



    }
}
