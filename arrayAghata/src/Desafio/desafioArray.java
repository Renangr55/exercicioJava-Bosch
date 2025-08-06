package Desafio;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class desafioArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a quantidade de informações do produtos que você vai inserir: ");
        int quantidadeInformações = scanner.nextInt();

        scanner.nextLine();

        String[] produto = new String[quantidadeInformações];
        double[] preco = new double[quantidadeInformações];
        int[] quantidade = new int[quantidadeInformações];



        int somaQuantidade = 0;
        double somaPreco = 0;
        double totalEstoque = 0;


        for (int i = 0; i < quantidadeInformações; i++){
            System.out.print("Digite o nome do produto: ");
            produto[i] = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            preco[i] = scanner.nextDouble();

            System.out.print("Digite a quantidade do produto: ");
            quantidade[i] = scanner.nextInt();

            somaQuantidade += quantidade[i];
            somaPreco += preco[i];
            totalEstoque += quantidade[i] * preco[i];



            System.out.println("____________________________________");
            scanner.nextLine();
        }



        // exibindo produtos

        System.out.println("Nome dos Produtos:");
        for (String i : produto){
            System.out.println(i);
        }
        System.out.println("____________________________________");

        System.out.println("Preço dos Produtos:");
        for (double i : preco){
            System.out.println(i);
        }
        System.out.println("____________________________________");

        System.out.println("Quantidade dos Produtos");


        for (int i : quantidade){
            System.out.println(i);
        }
        System.out.println("____________________________________");

        System.out.println("quantidade de produto no estoque: " + somaQuantidade);
        System.out.println("Somatória dos preços de cada lista: " + somaPreco);
        System.out.println("Total valor do estoque " + totalEstoque);



        scanner.close();










    }
}
