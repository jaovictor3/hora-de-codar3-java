import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1, num2, acum = 0, calc = 0;

        System.out.println("Informe um número: ");
        num1 = ler.nextInt();

        System.out.println("Informe outro número: ");
        num2 = ler.nextInt();

        while(num1 <= num2) {
            acum+=num1;
            num1++;
            calc++;
        }
        System.out.println(acum/calc);
    }
}
