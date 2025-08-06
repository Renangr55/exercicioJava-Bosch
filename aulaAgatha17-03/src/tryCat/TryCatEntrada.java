package tryCat;

import java.util.Scanner;


public class TryCatEntrada {

    static int dividir (int numerador,int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("digite o denominador: ");
            int denominador = scanner.nextInt();

            int resultado = dividir(numerador,denominador);
            System.out.println("Resultado: " + resultado);


        } catch (ArithmeticException e){
            System.out.println("Erro: não é possivel dividir por 0");

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida. Certifique-se de inserir números inteiros");
        } finally {
            scanner.close();
            System.out.println("Programa finalizado");
        }
    }

}
