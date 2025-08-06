package exercicios;
import java.util.Scanner;

public class ex5 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);



        int saldoPositivo = 0;
        int saldoNegativo = 0;


        do {
            System.out.print("digite seu saldo: ");
            int saldo = scanner.nextInt();


            if (saldo > 0) {
                saldoPositivo++;
            } else if (saldo < 0) {
                saldoNegativo++;
            }

            System.out.print("digite se vc deseja inserir mais pessoas: ");
            int opcao = scanner.nextInt();



            if (opcao == 1){
                continue;
            } else if (opcao == 2) {
                System.out.println("Você finalizou o processo");
                break;
            } else {
                System.out.println("insira um número válido");
            }


        } while (true);

        System.out.println("pessoas com o saldo psitivo: " + saldoPositivo);
        System.out.println("Pessoas com o saldo negativo: " + saldoNegativo);

        if (saldoPositivo > saldoNegativo * 0.5) {
            System.out.println("nenhum risco");
        } else {
            System.out.println("alto risco");
        }

    }
}
