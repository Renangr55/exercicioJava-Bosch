package atividades_aula_java;

import java.util.Scanner;

public class ex1 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 14) {
            System.out.print("sua idade é " + idade + " você é Criança" );
        } else if (idade >= 15 && idade <= 17) {
            System.out.print("sua idade é " + idade + " você é Adolescente" );
        } else if (idade >= 18 && idade <= 30) {
            System.out.print("sua idade é " + idade + " você é adulto Jovem");
        } else {
            System.out.print("sua idade é " + idade + " você é adulto Jovem");
        }


    }
}
