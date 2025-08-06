package exercicios_entrda_saida;

import java.util.Scanner;

public class ex3 {
    //Exercício 03:
    //FUP que calcule o valor de venda de uma mercadoria, considerando que o usuário irá
    //informar seu valor de compra. O valor de venda é: o valor de compra + 20% do
    //representante + 30% de impostos. Mostre o valor de venda dessa mercadoria e
    //separadamente, os valores do representante e dos impostos. Os valores
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inisra o valor de produto: ");
        double valor = scanner.nextInt();


        double valorRpresentante = valor * 0.2;
        System.out.println("valor do representante é:  " + valorRpresentante);

        double imposto = valor * 0.3;
        System.out.println("o valor do imposto é: " + imposto);

        double valorTotal = valor + valorRpresentante + imposto;
        System.out.println("o valor total da compra é: " + valorTotal);

        scanner.close();

    }
}
