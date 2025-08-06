package Desafio;

import java.util.Scanner;

public class desafio_extra {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int countNumberEquals = 0;
        int countNumbersdifferent = 0;
        int count = 0;

        System.out.print("type a the quantity: ");
        int quantity = sc.nextInt();



        int[] numbers = new int[quantity];

        for (int i = 0; i < quantity;i++){
            System.out.print("type a the number: ");
            numbers[i] = sc.nextInt();
        }


        for (int i = 0; i < numbers.length; i++){
            count = numbers[i];
            if(count != numbers[i]){
                countNumbersdifferent++;
            }
        }


        for (int i: numbers){
            System.out.println(i);
        }
        System.out.println("numeros diferentes: " + countNumbersdifferent);
        System.out.println("numero que se repete: " + countNumberEquals);
    }
}
