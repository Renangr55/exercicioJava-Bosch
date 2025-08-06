package exercicios;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ex3 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int feddbacks = 0;

        int avaliacaoOtima = 0;
        int avalicaoMedia = 0;
        int avaliacaoRuim = 0;


        do {
            System.out.println("insira sua avaliação: ");
            int avaliacao = scanner.nextInt();



            if (avaliacao == 1) {
                System.out.println("sua avaliacão foi otima");
                avaliacaoOtima++;
            } else if (avaliacao == 2) {
                System.out.println("sua avaliação foi média");
                avalicaoMedia++;
            } else if (avaliacao == 3) {
                System.out.println("sua avaliação foi péssima");
                avaliacaoRuim++;
            } else {
                System.out.println("Insira um feedback válido: ");
            }

            scanner.nextLine();

            System.out.println("você deseja dar mais uma nota: ");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase ("sim")) {
                continue;
            } else if (opcao.equalsIgnoreCase("não")) {
                break;
            } else {
                System.out.println("insira um número válido");
                break;
            }

        } while (true);


        int respondentes = avaliacaoRuim + avalicaoMedia + avaliacaoOtima;

        double respondentesAtalizados;

        respondentesAtalizados = respondentes;

        double media = (avaliacaoOtima * 1 + avalicaoMedia * 2 + avaliacaoRuim * 3 ) / respondentesAtalizados;

        System.out.println("quantidades de avaliações otimas foram: " + avaliacaoOtima);
        System.out.println("quantidades de avaliações bom foram: " + avalicaoMedia);
        System.out.println("quantidades de avaliações ruins foram: " + avaliacaoRuim);

        System.out.println("á media das notas foram: " + media);
        System.out.println("Respondents foram: " + respondentes);



    }
}
