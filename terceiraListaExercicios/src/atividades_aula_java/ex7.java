package atividades_aula_java;
import java.util.Scanner;
public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual pergunta,você deseja responder(1/2): ");
        int pergunta = scanner.nextInt();
        scanner.nextLine();

        if (pergunta == 1) {

            System.out.println("a) Neymar");
            System.out.println("b) Renan");
            System.out.println("c) Messi");

            System.out.println("Qual é o melhor jogador de futebol do brasil: ");
            String primeiraPergunta = scanner.nextLine();


            if (primeiraPergunta.equalsIgnoreCase("b")) {
                System.out.println("você acertou");
            } else if (primeiraPergunta.equalsIgnoreCase("a")) {
                System.out.println("Você errou");
            } else if (primeiraPergunta.equalsIgnoreCase("c")) {
                System.out.println("você errou");
            } else {
                System.out.println("Resposta inválida");
            }

        } else if (pergunta == 2) {

            System.out.println("a) Palmeiras");
            System.out.println("b) Santos");
            System.out.println("c) são paulo");

            System.out.println("Qual é o melhor time do brasil: ");
            String segundaPergunta = scanner.nextLine();


            if (segundaPergunta.equalsIgnoreCase("a")) {
                System.out.println("você acertou");
            } else if (segundaPergunta.equalsIgnoreCase("b")) {
                System.out.println("Você errou");
            } else if (segundaPergunta.equalsIgnoreCase("c")) {
                System.out.println("você errou");
            } else {
                System.out.println("Resposta inválida");
            }
        } else {
            System.out.println("Deu erro");
        }
        scanner.close();
    }
}
