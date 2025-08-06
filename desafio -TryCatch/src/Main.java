import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.Color;
public class Main {

    public static final String VERMELHO = "\033[31m";  // Cor vermelha
    public static final String RESET = "\033[0m"; // Resetar a cor para o padrão

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int contador = 1;
        System.out.println("Seja bem vindo");

        while (contador == 1) {
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("5 - Potenciacao");

            System.out.print("Escolha a opção que você deseja: ");
            int optionCalculator = 0;

            try {
                optionCalculator = scanner.nextInt();

                if (optionCalculator < 1 || optionCalculator > 5) {
                    System.out.println(VERMELHO + "Erro: Opção inválida. Tente novamente." + RESET);
                    scanner.nextLine();
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println(VERMELHO + "Erro: Entrada inválida. Por favor, insira um número inteiro" + RESET);
                break;
            }



            int firstNumberUser,secondNumberUser;

            try {
                System.out.println("insira o primeiro número: ");
                firstNumberUser = scanner.nextInt();

                System.out.println("insira o segundo número: ");
                secondNumberUser = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.print(VERMELHO + "Error:Entrada inválida" + RESET);
                scanner.close();
                break;

            } switch (optionCalculator) {
                case 1:
                    int soma = firstNumberUser + secondNumberUser;
                    System.out.println("a soma desses números são: " + soma);
                    scanner.nextLine();
                    break;
                case 2:
                    int subtracao = firstNumberUser - secondNumberUser;
                    System.out.println("a subtração desses números é: " + subtracao);
                    scanner.nextLine();
                    break;
                case 3:
                    int multiplicacao = firstNumberUser * secondNumberUser;
                    System.out.println("a multiplicação dos números é: " + multiplicacao);
                    scanner.nextLine();
                    break;
                case 4:
                    try {
                        int divisao = firstNumberUser / secondNumberUser;
                        scanner.nextLine();

                        if (firstNumberUser < secondNumberUser) {
                            System.out.println(VERMELHO + "O primeiro número não pode ser menor do que o segundo número" + RESET);
                        } else {
                            System.out.println("A divisão desses números é: " + divisao);
                        } break;


                    } catch (ArithmeticException e) {
                        if (firstNumberUser == 0 || secondNumberUser == 0) {
                            System.out.println(VERMELHO + "Error: o numero não pode ser divido por zero" + RESET);
                            continue;
                        }
                    }
                case 5:
                    double potenciacao = Math.pow(firstNumberUser,secondNumberUser);
                    System.out.println("a potenciação dos números é: " + potenciacao);
                    scanner.nextLine();
                    continue;

            }


            System.out.print("Deseja realizar outra operacao - (sim/não): ");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("não")) {
                System.out.println("processo encerrado....");
                break;
            } else if (opcao.equalsIgnoreCase("sim")) {
                continue;
            } else {
                System.out.print(VERMELHO + "opção invalida" + RESET);
                return;

            }


        }
        scanner.close();
    }
}