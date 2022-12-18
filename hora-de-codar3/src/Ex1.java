import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe dois valores: ");
        double valorA = ler.nextDouble();
        double valorB = ler.nextDouble();

        while(valorA <= 0) {
            System.out.println("Informe um valor maior que zero: ");
            valorB = ler.nextDouble();
        }

        System.out.println("A divisao entre os dois valores e = " + valorA/valorB);
        ler.close();
    }
}