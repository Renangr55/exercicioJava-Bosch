import java.util.Scanner;
public class ex2 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("digite a temperatura em farenheit: ");
        double fahrenheit = input.nextDouble();


        double celsius = ((5.0 * (fahrenheit - 32.00)) / 9.0);


        System.out.printf("%.2f Fahrenheit é igual a %.2f Celsius.\n", fahrenheit, celsius);



        input.close();

    }
}
