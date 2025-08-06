import java.util.Scanner;

public class ex5 {
    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da base do triangulo ");
        float base = input.nextFloat();

        System.out.print("Digite a altura de um triangulo ");
        float altura = input.nextFloat();


        float calcular = base * altura / 2;
        System.out.printf("A área do triângulo é: %.2f\n", calcular);

        input.close();


    }
}
