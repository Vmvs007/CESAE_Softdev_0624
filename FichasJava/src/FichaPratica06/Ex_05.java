package FichaPratica06;

public class Ex_05 {

    /**
     * Método que retorna o maior valor de um array de inteiros
     *
     * @param vetor Array a ser analisado
     * @return Maior valor do array
     */
    public static int maiorValorArray(int[] vetor) {

        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;

    }

    /**
     * Método que retorna o menor valor de um array de inteiros
     *
     * @param vetor Array a ser analisado
     * @return Menor valor do array
     */
    public static int menorValorArray(int[] vetor) {

        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;

    }

    /**
     * Método que retorna se um array é ou não crescente
     * @param vetor Array a ser analisado
     * @return true se crescente || false se não crescente
     */
    public static boolean arrayCrescente(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) { // Deixa de ser crescente
                return false;
            }
        }

        return true;
    }


}
