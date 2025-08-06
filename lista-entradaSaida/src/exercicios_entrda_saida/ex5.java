package exercicios_entrda_saida;
import java.util.Scanner;

public class ex5 {
    //FUP que peça ao usuário um horário, solicitando, separadamente: a quantidade de
    //horas, a quantidade de minutos e a quantidade de segundos. Ao final, mostre esse
    //horário em segundos.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira as quantidades de horas: ");
        int horario = scanner.nextInt();

        System.out.println("Insira a quantidade de minutos: ");
        int minutos = scanner.nextInt();

        System.out.println("Insira a quantidade de segundos: ");
        int segundos = scanner.nextInt();

        int convertendo = (horario * 3600) + (minutos * 60) + segundos;

        System.out.println("o horario é: " + convertendo);

        scanner.close();




    }
}
