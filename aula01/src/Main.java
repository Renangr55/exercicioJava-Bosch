import java.util.Scanner;
public class Main { //tenho a classe publica, a privada e a protegida , o main é o funcional de para a IDE conseguir interpretar o código
    public static void main(String[] args) {//static = statica void = não retorna nada
        //scnner para receber input do usuário
        Scanner batatinhaFrita = new Scanner(System.in);

        int idade = 25;
        double altura = 1.76;
        char inicial = 'a';
        boolean estudante = true;

        ///demonstando diferentes tipos de entrada
        System.out.print("\nexemplos de saida:");//print imprime sem pular linha
        System.out.print("\nsocorro ");//sout cria o system out print sem precisar escrever

        System.out.println("exemplo de print z\n"); // \n é oque faz pular linha

        //usando print para a formatação de string
        //%d é usado para identificar inteiros
        //%2f é usados para float ou doubles com duas casas decimimais
        //%c é usado para caracteres

        System.out.printf("Minha idade é: %d anos, minha altura é %.2f, minha inicial é %c" ,idade,altura,inicial);

        //solicitando entrada do usuario

        System.out.print(" digite seu nome: ");
        String nome_Usuario = batatinhaFrita.nextLine();

        System.out.printf("Digite sua idade: ");
        int idadeUsuario = batatinhaFrita.nextInt();

        System.out.println("Digite sua altura em metros: ");
        double alturaUsuario = batatinhaFrita.nextDouble();

        //Imprimindo informações com formatação usando printf
        //%s é um placeholder para strings
        //d% para inteiros
        //%.2f para números decimais com duas casas

        System.out.printf("Nome? %s\nidade: %d\nAltura: %.2f metros\n",nome_Usuario,idadeUsuario,alturaUsuario );



    }
}