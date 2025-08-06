import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inicializando o sacnner para receber as entradas dos usuários
        Scanner BatatinhaFrita = new Scanner(System.in);

        //tipos de dados primitivos
        int idade = 25;  // int = -128 a 127
        double altura = 1.75;
        float manskj = 2.11f;
        char inicial = 'A'; //representa apenas um caracter
        boolean estudante = true;

        //TIPOS DE DADOS INTEIROS
        byte num = 1;
        short papa = 32220;   // short = 32.768 a 32.767
        long renan = 536473653; // long = -9.223.372.036.854.755.808 a 9.223.372.036.854.755.807

        // TIpos de dados de string
        String nana = "maluco"; // representa varios caracters

        //Demonstrando diferentes tipos de saída
        System.out.print("exemplo de Saída\n"); //print imprime sem puar linha
        System.out.print("Essa é a mesma linha."); //adiciona uma nova linha no final

        System.out.println("Exemplo de println");
        System.out.println("Essa \n é uma nova linha.");
        System.out.println("Meu nome\r é renan gabriel");
        System.out.println("Essa \n é uma nova linha.");

        //System.out.printf(); formatação de strings

        //Usando printf para formatação de strings
        //%d é usado para identificar números
        //%2f é usado para ponto flutuante com 2 casas decimais
        //%c é usado para caracteres

        System.out.printf("Minha idade é %d anos, minha altura é %.2f metros e a minha inicial é %c, \n",idade,altura,inicial);




    }

}