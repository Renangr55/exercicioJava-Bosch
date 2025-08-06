package exercicios;
import java.util.Scanner;

public class ex4 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numeroUsuario = scanner.nextInt();

        System.out.print("Insira um número para o incremento: ");
        int incrementoUsuario = scanner.nextInt();

        for (;numeroUsuario >= 0; numeroUsuario -= incrementoUsuario) {
            System.out.println("Número Atual: " + numeroUsuario);

        }
    }




}
