import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int aprovados = 0;
        int x = 0;
        String g = "n";

        for( ; x < 10; x++) {
            System.out.println("Qual a primeira nota?");
            double um = ler.nextInt();
            System.out.println("Qual a segunda nota?");
            double dois = ler.nextInt();
            double conta = (um + dois) /2;

            if(conta >= 9.5) {
                aprovados++;
            };

            System.out.println("Calcular a media de outro aluno sim nao? ");
            ler.nextLine();
            String p = ler.nextLine();

            switch( p ){
                case ( "N" ):
                    System.out.println("O numero de alunos aprovados foi de: " + aprovados);
                    x = 10;
                    break;
                case ( "n" ):
                    System.out.println("O numero de alunos aprovados foi de: " + aprovados);
                    x = 10;
                    break;
                case ( "nao" ):
                    System.out.println("O numero de alunos aprovados foi de: " + aprovados);
                    x = 10;
                    break;
            }

        }

    }
}
