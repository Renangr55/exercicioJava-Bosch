package Exemplo_array;

import java.util.Scanner;

public class jogoInterativoTimes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many names do you want to type?");
        int quantity = sc.nextInt();
        sc.nextLine();

        String[] names = new String[quantity];

        for (int i = 0; i < quantity; i++){
            System.out.println("Type the name of number: " + (i + 1) + " : ");
            names[i] = sc.nextLine();
        }

        int countofA = 0;

        for (int i = 0; i < names.length; i++){
            String name = names[i];

            if (name.startsWith("A") || name.startsWith("a")) {
                countofA++;
            }

        }
        System.out.println("Your typed " + countofA + " ");

        sc.close();

    }



}
