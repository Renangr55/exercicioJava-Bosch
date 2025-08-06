package atividades_aula_java;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá,onde pretende passar suas férias: ");
        String usuario = scanner.nextLine();

        // Verificação para maceió
        if (usuario.equalsIgnoreCase("maceió")) {
            System.out.println("Você escolheu: maceió");

            System.out.print("Você deseja almoço/janta incluso:");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("Sim")) {
                int valorBase = 3000;
                valorBase += valorBase;
                System.out.printf("Sua viagem ficou %d",valorBase);

            } else if (opcao.equalsIgnoreCase("Não")) {
                int valorBase = 3000;
                double porcentagem = 0.85;
                double total = valorBase + (valorBase * porcentagem );
                System.out.printf("O valor da compra sem almoço e janta é: %f", total);
            } else {
                System.out.println("Deu erro!!");
            }
        
        // Verificação para Porto de galinhas

        } else if (usuario.equalsIgnoreCase("Porto de galinhas")) {
            System.out.print(("Você escolheu: Porto de galinhas"));

            System.out.print("Você deseja almoço/janta incluso:");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("Sim")) {
                int valorBase = 3000;
                double porcetagem = 0.6;
                double calculando = valorBase + (valorBase * porcetagem);
                System.out.printf("Sua viagem ficou %f",calculando);

            } else if (opcao.equalsIgnoreCase("Não")) {
                int valorBase = 3000;
                double porcentagem = 0.45;
                double total = valorBase + (valorBase * porcentagem );
                System.out.printf("O valor da compra sem almoço e janta é: %f", total);
            }

        }
    }
}
