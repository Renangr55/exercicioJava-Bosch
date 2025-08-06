package exercicios_entrda_saida;
import java.util.Scanner;

public class ex2 {
    //FUP que receba dois números inteiros e mostre na tela:
    // Soma dos dois números
    // Subtração do primeiro pelo segundo
    // Multiplicação dos dois números
    // Divisão do primeiro número pelo segundo
    // O primeiro número elevado ao segundo número
    // O resto da divisão do primeiro número pelo segundo
    static public void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Insira seu segundo número: ");
        int segundoNumero = scanner.nextInt();



        int soma = primeiroNumero + segundoNumero;
        System.out.println("a soma é " + soma);

        int subtracao = primeiroNumero - segundoNumero;
        System.out.println("a subtração é " + subtracao);

        int mutiplicacao = primeiroNumero * segundoNumero;
        System.out.println("a mutiplicação é " + mutiplicacao);

        int divisao = primeiroNumero / segundoNumero;
        System.out.println("a divisão dos números é: " + divisao);

        double elevacao = Math.pow(primeiroNumero, segundoNumero);
        if (elevacao != 0) {
            System.out.println("a elevação dos números é: " + elevacao);
        } else {
            System.out.println("o número é 0 ,precisa ser diferente de zero e maior que zero");
        }

        int resto = primeiroNumero % segundoNumero;
        System.out.println("o resto é " + resto );

        scanner.close();

    }


}
