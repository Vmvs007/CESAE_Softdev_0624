package Ex_10;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento) {
        this.salario += this.salario * aumento / 100;
    }

    public void exibirDetalhes(){
        System.out.println("________________________________________________________________________________________");
        System.out.println("Nome: "+this.nome+" | Departamento: "+this.departamento+" | Salário: "+this.salario+" €");
    }
}
