package exercicios;
import java.util.Scanner;

public class ex6 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número que você deseja ver a tabuada: ");
        int tabuada = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + "x" + i + "=" + (tabuada * i));

        }

    }
}
