package Ex_02;


public class Conta {
    private String numConta;
    private String titular;
    private double saldo;
    private int anoAbertura = 2024;
    private double valorDivida;

    public Conta(String numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getMargemEmprestimo() {
        return this.saldo * 0.9;
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

    public boolean pedirEmprestimo(double valorPedido) {

        if (this.valorDivida == 0 && this.getMargemEmprestimo() >= valorPedido) {

            // System.out.println("Emprestimo Concedido: "+valorPedido);

            // Emprestimo Concedido
            this.saldo += valorPedido;
            this.valorDivida += valorPedido;
            return true;
        }

        // System.out.println("Emprestimo Negado: "+valorPedido);
        return false;
    }

    public void exibirDetalhes() {
        System.out.println("_________________________________________________________________________________________");
        System.out.println("Núm. Conta: " + this.numConta + " | Titular: " + this.titular + " | Saldo: " + this.saldo);
    }
}
