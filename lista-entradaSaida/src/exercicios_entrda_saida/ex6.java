package exercicios_entrda_saida;

import java.util.Scanner;

public class ex6 {
    public static void main (String[] args) {
        //Exercício 06:
        //FUP que a partir de 02 notas de um aluno, seja calculada e mostrada sua média
        //ponderada, considerando os pesos: 40% para a primeira nota e 60% para a segunda
        //nota.

        Scanner scanner = new Scanner(System.in);

        System.out.println("insira a primeira nota: ");
        float primeiraNota = scanner.nextFloat();

        System.out.println("insira a segunda nota: ");
        float segundaNota = scanner.nextFloat();

        float media = (primeiraNota + segundaNota) / 2;
        System.out.println("sua média é: " + media);
    }
}
