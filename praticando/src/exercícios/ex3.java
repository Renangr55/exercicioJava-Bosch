package exercícios;

import java.util.Scanner;


public class ex3 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o angulo: ");
        int angulo = scanner.nextInt();


        rad = (Math.PI/180) * angulo;
        seno = Math.sin(rad);
        System.out.println("\nO Seno do angulo " + angulo + " e: " + Math.sin(rad));
        System.out.print("\nDigite a Hipotenusa: ");
        hip = scan.nextDouble();
        System.out.println("\nO Resultado final e: " + seno * hip );






        rad = (Math.PI/180) * angulo;
        cosseno = Math.cos(rad);
        System.out.println("\nO Cosseno do angulo " + angulo + " e: " + Math.cos(rad));
        System.out.print("\nDigite a Hipotenusa: ");
        hip = scanner.nextDouble();
        System.out.println("\nO Resultado final e: " + cosseno * hip );



        rad = (Math.PI/180) * angulo;
        tangente = Math.tan(rad);
        System.out.println("\nA Tangente do angulo " + angulo + " e: " + Math.tan(rad));
        System.out.print("\nDigite o Cateto Adjacente: ");
        ca = scan.nextDouble();
        System.out.println("\nO Resultado final e: " + tangente * ca );




        }


}