package exercicios_entrda_saida;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class ex1 {
    //FUP que solicite os dados de cadastro de uma pessoa para uma futura vaga de
    //emprego na Bosch. É necessário solicitar: nome, sobrenome, data de nascimento,
    //pretensão salarial, grau de instrução (ensino médio, ensino técnico ou ensino superior),
    //cargo pretendido e se a pessoa possui CNH do tipo B (sim ou não). Após solicitar os
    //dados ao usuário, uma mensagem informando todos os dados solicitados e
    //confirmando o cadastro deve ser exibida ao usuário.
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrrenomeUsuario = scanner.nextLine();

        System.out.print("Digite sua data de nascimento (dd/MM/yyyy):  ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite sua pretensão salarial: ");
        int pretensaoSalarial = scanner.nextInt();

        System.out.print("Digite seu grau de instituição: ");
        String grauInstituicao = scanner.nextLine();

        System.out.print("Você possui CNH do tipo B: \n");
        String cnh = scanner.nextLine();




        if(cnh.equalsIgnoreCase("sim")) {
            System.out.println("seu nome é: " + nomeUsuario + "-  seu sobrenome é: " + sobrrenomeUsuario + " - sua data de nascimeto é: " + dataNascimento + " \n - sua pretensão salarial é: " + pretensaoSalarial + " - seu grau de instituição é: " + grauInstituicao + " - você possui CNH tipo B: " + cnh  );
        } else if (cnh.equalsIgnoreCase("não")){
            System.out.println("seu nome é: " + nomeUsuario + "-  seu sobrenome é: " + sobrrenomeUsuario + " - sua data de nascimeto é: " + dataNascimento + " \n - sua pretensão salarial é: " + pretensaoSalarial + " - seu grau de instituição é: " + grauInstituicao + " - você possui CNH tipo B: " + cnh  );
        } else {
            System.out.println("Insira uma resposta válida");
        }
        scanner.close();

    }
}
