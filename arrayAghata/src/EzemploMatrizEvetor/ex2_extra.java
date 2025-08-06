package EzemploMatrizEvetor;

import java.util.Scanner;

public class ex2_extra {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] matriz = new int[3][3];
        int [] vetor = new int[3];
        int [] resultado = new int[3];

        int soma = 0;

        for (int i = 0; i < 3; i++){
            resultado[i] = 0;
            for (int j = 0; j < 3;j++){
                System.out.println("A[" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
                resultado[i] += matriz[i][j] * vetor[j];
            }

        }

        for (int i = 0;i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }

        for (int i = 0; i < 3; i++){
            System.out.println("C[" + i + "]: " + resultado[i]);
        }

        System.out.println("Resutado: " + soma);
        sc.close();

    }
}
