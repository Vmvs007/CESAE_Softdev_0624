package FichaPratica03;

public class Ex_07 {
    public static void main(String[] args) {

        int count = 1, somatorio = 0;

        while (count <= 100) {
            System.out.println(count);

            somatorio = somatorio + count;

            count++;
        }

        System.out.println("Somatório: " + somatorio);

    }
}
