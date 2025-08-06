import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = input.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = input.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.printf("O resultado de delta é: %.2f\n", delta);

        input.close();
    }
}
