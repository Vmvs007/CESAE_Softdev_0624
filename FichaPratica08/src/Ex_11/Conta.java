package Ex_11;


public class Conta {
    private String numConta;
    private String titular;
    private double saldo;

    public Conta(String numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void levantar(double valorLevantamento) {

        if (this.saldo >= valorLevantamento) {
            this.saldo -= valorLevantamento;
        }

    }

    public void transferir(double valorTransferencia, Conta contaDestino) {

        if (this.saldo >= valorTransferencia) {
            this.saldo -= valorTransferencia;
            contaDestino.saldo += valorTransferencia;

        }
    }


    public void exibirDetalhes() {
        System.out.println("_________________________________________________________________________________________");
        System.out.println("Núm. Conta: " + this.numConta + " | Titular: " + this.titular + " | Saldo: " + this.saldo);
    }
}
