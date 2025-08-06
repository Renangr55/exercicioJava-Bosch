package exercícios;
import java.util.Scanner;

public class ex1 {

    public static void main (String[] Args) {


        Scanner scanner = new Scanner(System.in);



        System.out.print("Digite uma palavra: ");
        String palavraUsuario = scanner.nextLine();

        palavraUsuario.toLowerCase();

        int contadorVogal = 0;
        int contadorConsoante = 0;


        for (int i = 0; i <= palavraUsuario.length(); i++) {
            char c = palavraUsuario.charAt(i);


            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVogal ++;
            } else if (c >= 'a' && c <= 'z') {
                contadorConsoante ++;
            }


        }

        System.out.println(contadorVogal);
        System.out.println(contadorConsoante);

    }


}
