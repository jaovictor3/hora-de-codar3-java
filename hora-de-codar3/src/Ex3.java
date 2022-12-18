import java.util.Scanner;
import java.util.Locale;

public class Ex3{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int a;


        for(a = 10; a > 0; a--) {
            System.out.println(a);
        }

        System.out.println("Oi meu chapa!");
        sc.close();
    }

}
