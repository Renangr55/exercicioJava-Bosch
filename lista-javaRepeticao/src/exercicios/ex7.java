package exercicios;
import java.util.Scanner;

public class ex7 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        float maiorPeso = 0;
        String nomePesado = "";

        float pessoaAlta = 0;
        String nomeAlto = "";

        int pessoas = 2;
        int contador = 1;

        while (contador <= pessoas) {
            System.out.println("digite seu nome: " + +contador);
            String nome = scanner.nextLine();

            System.out.println("digite sua altura" + contador);
            float altura = scanner.nextFloat();

            System.out.println("digite seu peso" + contador);
            float peso = scanner.nextFloat();

            scanner.nextLine();

            if (peso > maiorPeso) {
                maiorPeso = peso;
                nomePesado = nome;
            }

            if (altura > pessoaAlta) {
                pessoaAlta = altura;
                nomeAlto = nome;


            }

            contador++;
        }

        System.out.println("nome da pessoa mais alta: " + nomeAlto + " altura da pessoa é " + pessoaAlta);
        System.out.println("nome da pessoa mais pesada: " + nomePesado + " peso da pessoa é " + maiorPeso);

        scanner.close();

    }

}
