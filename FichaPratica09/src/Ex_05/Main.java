package Ex_05;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor Santos",24,"vitor@gmail.com","911 222 333");
        Pessoa pessoa2 = new Pessoa("Joaquim A.",45,"quim@gmail.com","903 444 555");
        Pessoa pessoa3 = new Pessoa("Joana P.",33,"joana@mail.com","988 999 888");

        Agenda aMinhaAgenda = new Agenda();

        aMinhaAgenda.addPessoa(pessoa1);
        aMinhaAgenda.addPessoa(pessoa2);
        aMinhaAgenda.addPessoa(pessoa3);

        aMinhaAgenda.imprimirCatalogo();

    }
}
