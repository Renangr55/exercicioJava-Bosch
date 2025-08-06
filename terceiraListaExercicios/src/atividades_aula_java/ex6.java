package atividades_aula_java;
import java.util.Random;
import java.util.Scanner;
public class ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randow = new Random();

        int numeroSecreto = randow.nextInt(100);

        int tentativas = 3;

        System.out.println(numeroSecreto);

        while (tentativas > 0) {
            System.out.print("faça seu palpite: ");
            int palpite = scanner.nextInt();
            if (palpite == numeroSecreto) {
                System.out.println("Você acertou!!!");
                break;
            } else if (palpite != numeroSecreto) {
                System.out.println("Você errou");
                tentativas --;
            } else {
                System.out.println("Suas tentativas acabaram");
            }
        }

        if (tentativas == 0) {
            System.out.println("Acabaram sua tentativas");
        }


    }
}
