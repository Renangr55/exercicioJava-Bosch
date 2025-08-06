package EzemploMatrizEvetor;
import java.util.Scanner;
public class ex1_extra {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int [][] integerNumbers = new int[3][3];
        int [] vetorSoma = new int[3];

        int soma = 0;

        for(int i = 0; i < 3;i++ ){
            for (int j = 0; j < 3;j++){
                System.out.print("A[" + i + "][" + j + "]: ");
                integerNumbers[i][j] = scanner.nextInt();

            }
        }

        for(int i = 0; i < 3;i++ ){
            for (int j = 0; j < 3;j++){
                System.out.print("A[" + i + "][" + j + "]: ");
                soma += integerNumbers[i][j];
            }
            vetorSoma[i] += soma;
        }


        for (int a = 0; a < integerNumbers.length;a++){
            for (int t = 0; t < integerNumbers.length; t++){
                System.out.println(integerNumbers[a][t]);
            }
        }


        System.out.println("vetores");
        for (int i = 0; i < 3;i++){
            System.out.println(vetorSoma[i] + " ");
        }

        System.out.println("a soma é: " + soma);

    }
}
