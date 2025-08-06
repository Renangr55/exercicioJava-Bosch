import java.util.Scanner;

public class ex3 {

    public static void main (String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("digite seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();


        double imc = peso / (altura * altura);


        System.out.printf("O seu IMC é: %.2f\n ", imc);


        input.close();



    }
}
