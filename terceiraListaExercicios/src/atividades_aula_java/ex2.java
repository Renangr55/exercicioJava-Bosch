package atividades_aula_java;

import java.util.Scanner;

public class ex2 {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        int valor = scanner.nextInt();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        if (quantidade > 1 && quantidade <= 12) {
            int valorUnitario = valor * quantidade;
            System.out.printf("O valor unitário = %d",(valorUnitario) );
        } else if (quantidade > 12) {
            double desconto = 0.1;
            double valorUnitario = valor - (valor * desconto);
            System.out.printf("o valor da compra foi %.2f  ",(valorUnitario));
        } else {
            System.out.println("A compra não foi realizada");
        }


    }
}
