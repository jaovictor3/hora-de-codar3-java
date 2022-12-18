import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double i = 15;
        double acumuladora = 0;
        double cont = 0;

        while(i < 100) {
            i++;
            cont++;
            acumuladora += i;
        }
        System.out.println(acumuladora/cont);
    }
}