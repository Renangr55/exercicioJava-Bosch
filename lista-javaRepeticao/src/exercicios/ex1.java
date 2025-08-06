package exercicios;
import java.util.ArrayList;
import java.util.Scanner;


public class ex1 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tentativasUsuario = 10;

        ArrayList<Integer> numbersPares = new ArrayList<>();
        ArrayList<Integer> numbersImpares = new ArrayList<>();
        ArrayList<Integer> numbersPositivos = new ArrayList<>();
        ArrayList<Integer> numbersNegativos = new ArrayList<>();





        while (tentativasUsuario > 0) {
            System.out.print("Digite um número: ");
            int numerosUsuario = scanner.nextInt();
            tentativasUsuario -= 1;

            if (numerosUsuario % 2 == 0) {
                numbersPares.add(numerosUsuario);
            } else {
                numbersImpares.add(numerosUsuario);
            }

            if (numerosUsuario > 0) {
                numbersPositivos.add(numerosUsuario);
            } else {
                numbersNegativos.add(numerosUsuario);
            }


        }

         scanner.nextLine();

        System.out.print("Qual quantidade de tipo de números vc querr: " );
        String tipoUsuario = scanner.nextLine();



        switch (tipoUsuario) {
            case "pares":
                 System.out.println("numeros pares: " + numbersPares);
                 break;
            case "impares":
                System.out.println("numeros impares: " + numbersImpares);
                break;
            case "negativos":
                System.out.println("Números  negativos: " + numbersNegativos);
            case "positivos":
                System.out.println("Numeros Positivos: " + numbersPositivos);
                break;
            default:
                System.out.println("opção inválida");
                
        }
    scanner.close(); 
    }
}
