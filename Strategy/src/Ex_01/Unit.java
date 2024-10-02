package Ex_01;

public class Unit {
    private String nome;
    private int vida;
    private int forca;
    private AttackStrategy attackStrategyAtual;

    public Unit(String nome, int vida, int forca, AttackStrategy attackStrategyAtual) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.attackStrategyAtual = attackStrategyAtual;
    }

    public void performAttack(){
        attackStrategyAtual.attack();
    }

    /**
     * Método de trocar de estratégia - reconversão de carreira
     * @param attackStrategyAtual
     */
    public void setAttackStrategyAtual(AttackStrategy attackStrategyAtual) {
        System.out.println("\nCarreira reconvertida!\n");
        this.attackStrategyAtual = attackStrategyAtual;
    }
}
