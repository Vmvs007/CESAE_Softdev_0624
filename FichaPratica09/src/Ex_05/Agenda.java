package Ex_05;


public class Agenda {
    private Pessoa[] listaAgenda;


    public Agenda() {
        this.listaAgenda = new Pessoa[20];
    }

    public void addPessoa(Pessoa pessoaNova) {

        for (int i = 0; i < this.listaAgenda.length; i++) {
            if (this.listaAgenda[i] == null) {
                this.listaAgenda[i] = pessoaNova;
                return;
            }
        }

    }

    public void imprimirCatalogo() {
        System.out.println("*-*-*-*-* Agenda *-*-*-*-*");

        for (int i = 0; i < this.listaAgenda.length && this.listaAgenda[i] != null; i++) {
            System.out.print("Contacto " + (i + 1) + ": ");
            this.listaAgenda[i].exibirDetalhes();
        }
    }
}
