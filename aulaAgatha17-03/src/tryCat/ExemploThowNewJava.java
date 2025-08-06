package tryCat;

import java.util.Scanner;

public class ExemploThowNewJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("type the years: ");
            int years = scanner.nextInt();

            if (years > 18) {
                throw new IllegalArgumentException("Erro: odade mínima é 18 anos");

            }

            System.out.println("Cadastro reaizado com sucesso");

        } catch (IllegalArgumentException e) {
            System.out.println("Execeções capturadas: " + e.getMessage());
        }finally {
         scanner.close();
            System.out.println("ending program");
        }
    }
}
