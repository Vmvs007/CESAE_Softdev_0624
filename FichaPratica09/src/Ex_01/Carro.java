package Ex_01;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cc;
    private TipoCombustivel combustivel;
    private double consumoL100Km;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cc, TipoCombustivel combustivel, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cc = cc;
        this.combustivel = combustivel;
        this.consumoL100Km = consumoL100Km;
    }

    public int getIdade() {
        return 2024 - this.anoFabrico;
    }

    public void ligar() {

        if (this.getIdade() > 30) { // O carro tem mais de 30 anos

            if (this.combustivel.equals(TipoCombustivel.DIESEL)) { // Diesel

                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");

            } else { // Outro combustivel

                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");

            }

        } else { // O carro tem 30 ou menos anos

            if (potencia < 250) { // Menos de 250 cv

                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmmmmmmmmmmmm");

            } else { // 250 ou mais cv

                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMMMM");

            }

        }

    }

    /**
     * Método que faz uma corrida entre dois carros
     *
     * @param adversario Carro do Adversário
     * @return Carro Vencedor
     */
    public Carro corrida(Carro adversario) {

        if (this.potencia > adversario.potencia) {
            // Ganha o meu carro por potencia
            return this;
        } else {

            if (this.potencia < adversario.potencia) {
                // Ganha o adversario por potencia
                return adversario;
            } else {
                // Empate de potencia

                if (this.cc > adversario.cc) {
                    // Ganha o meu carro por cc
                    return this;
                } else {

                    if (this.cc < adversario.cc) {
                        // Ganha o adversario por cc
                        return adversario;
                    } else {
                        //Empate de cc

                        if (this.anoFabrico > adversario.anoFabrico) {
                            // Ganha o meu carro por ser mais recente
                            return this;
                        } else {

                            if (this.anoFabrico < adversario.anoFabrico) {
                                // Ganha o adversario por ser mais recente
                                return adversario;
                            } else {
                                // Empate total
                                return null;
                            }
                        }
                    }
                }

            }

        }

    }

    public void exibirDetalhes() {
        System.out.println("***** " + this.marca + " " + this.modelo + " *****");
        System.out.println("Potência: " + this.potencia + " cv.");
        System.out.println("Cilindrada: " + this.cc + " cc");
        System.out.println("Ano Fabrico: " + this.anoFabrico);
        System.out.println("Tipo Combustivel: " + this.combustivel);
        System.out.println("Consumo: " + this.consumoL100Km + " L/100Km.");
        System.out.println("****************************");
    }


}
