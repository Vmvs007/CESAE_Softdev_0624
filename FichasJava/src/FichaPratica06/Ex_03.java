package FichaPratica06;

public class Ex_03 {

    /**
     * Método que retorna se um número é par ou impar
     *
     * @param num Número inteiro
     * @return true se par || false se impar
     */
    public static boolean parImpar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que retorna se um número é positivo ou negativo
     *
     * @param num Número inteiro
     * @return true se positivo || false se negativo
     */
    public static boolean positivoNegativo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que retorna se um número é ou não primo
     *
     * @param num Número inteiro
     * @return true se primo || false se não primo
     */
    public static boolean primo(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Método que retorna se um número é ou não perfeito
     *
     * @param num Número inteiro
     * @return true se perfeito || false se não perfeito
     */
    public static boolean perfeito(int num) {

        int somaDivisores = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) { // Se isto for true, i é divisor de num
                somaDivisores = somaDivisores + i;
            }
        }

        if (somaDivisores == num) {
            return true;
        } else {
            return false;
        }


    }

    public static boolean triangular(int num) {

        int triangulares = 0;

        for (int i = 1; triangulares < num; i++) {

            triangulares = triangulares + i;

            // System.out.println("Vou comparar o " + num + " com o " + triangulares);
            if (num == triangulares) {
                return true;
            }

        }

        return false;
    }


}
