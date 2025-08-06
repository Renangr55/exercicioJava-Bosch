package deafios_array_7e8;
import java.util.Scanner;
public class desafio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de nomes que você deseja inserir: ");
        int quantidadeNomes = sc.nextInt();


        sc.nextLine();

        String[] nomes = new String[quantidadeNomes];
        int[] contagem = new int[quantidadeNomes];

        int contadorIguais = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite um nome: ");
            nomes[i] = sc.nextLine().toLowerCase();
            for (int j = i + 1 ; j < nomes.length; j++){
                if (nomes[i].equals(nomes[j])){
                    contadorIguais++;
                }
            }
        }

        System.out.println("Quantidade de nomes iguais: " + contadorIguais);

    }
}
