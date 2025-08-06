package exercicios;
import java.util.Scanner;
import java.util.ArrayList;

public class ex2 {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idades = 0;
        int alturas = 0;
        int peso = 0;




        for (int i = 0;i <= 10; i++) {
            System.out.print("Insira sua idade: ");
            int idadeUsuarios = scanner.nextInt();


            System.out.print("insira sua altura: ");
            float alturaUsuario = scanner.nextFloat();


            System.out.print("Insira seu peso: ");
            float pesoUsuario = scanner.nextFloat();

            if (idadeUsuarios > 50) {
                idades +=1;
            }

            if (alturaUsuario > 1.60) {
                alturas += 1;
            }

            if (pesoUsuario > 80.00 ) {
                peso += 1;
            }
        }

        System.out.println("pesoas acima de 50 anos: " + idades);
        System.out.println("pessoas com acima de 1.60 de altura: " + alturas);
        System.out.println("pessoas com acima de 80 kg: " + peso);
    }
}
