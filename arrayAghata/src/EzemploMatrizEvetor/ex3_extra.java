package EzemploMatrizEvetor;

import java.util.Scanner;

public class ex3_extra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] nomes = new String[3][3];


        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("A["+ i +"]["+ j +"]");
                nomes[i][j] = sc.nextLine();
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(nomes[i][j]);


            }
        }


    }
}
