import java.util.Scanner;
public class ex4 {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = input.nextInt();

        int quadrado = valor * valor;
        int cubo = valor * valor * valor;

        System.out.printf("o valor ao quadrado é %d",quadrado);
        System.out.printf("\no valor ao cubo é %d",cubo);




    }


}
