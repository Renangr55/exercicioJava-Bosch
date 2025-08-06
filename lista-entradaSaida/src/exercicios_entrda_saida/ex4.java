package exercicios_entrda_saida;

import java.util.Scanner;

public class ex4 {

        //Exercício 04:
        //FUP que peça ao usuário um número inteiro. A partir dessa entrada, mostre na tela: o
        //número, seu antecessor e seu sucessor. Ex.: “O número informado foi 30, o antecessor
        //é 29 e o sucessor é 31”.
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insira um número inteiro: ");
        int valor = scanner.nextInt();
        System.out.println("o valor que você digitou é: " + valor);

        int antecessor = valor - 1;
        System.out.println("o valor do antecessor é: " + antecessor);

        int sucessor = valor + 1;
        System.out.println("o valor do sucessor é: " + sucessor);


    scanner.close();
    }
}
