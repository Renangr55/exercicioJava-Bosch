package EzemploMatrizEvetor;

import java.util.Scanner;

public class matrizEvetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 5;
        int[][] matrizMultidimensional = new int[quantidade][quantidade];

        for (int i = 0; i < quantidade; i++){
            for (int j = 0; j < quantidade; i++){
                System.out.println("Posição [" + i + "][" + j + "]: ");
                matrizMultidimensional[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz digitada: ");
        for (int i = 0; i < quantidade;i++){
            for (int j = 0;j < quantidade;j++){
                System.out.println(matrizMultidimensional[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
