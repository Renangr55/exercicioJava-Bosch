package array;

import java.util.Scanner;



//Exercício 4: Contagem de Elementos
//Crie um programa que leia um array de inteiros e conte quantas vezes um determinado número aparece no array.
//
//Entrada: O programa deve pedir o número a ser contado e o array.
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        System.out.print("insira um número que você deseja procurar: ");
        int userNumber = scanner.nextInt();

        int [] numbers = {10,10,20,40,50,60,70,80,90,100};


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == userNumber) {
                contador++;
            }
        }

        System.out.println("o número que você digitou é: " + userNumber);
        System.out.println("a quantidade desse número na lista é: " + contador);
    }
}
