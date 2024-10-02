package Ex_01;

public class Main {
    public static void main(String[] args) {
        Unit vitor = new Unit("Vitor", 100, 20, new RangedAttackStrategy());

        vitor.performAttack();
        vitor.performAttack();

        vitor.setAttackStrategyAtual(new MagicAttackStrategy());

        vitor.performAttack();
    }
}
