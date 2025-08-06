public class OpreadoresAritmeticos {

    public static void main (String[] args) {

        int a = 10;
        int b = 5;
        double x = 7.5;
        double y = 3.2;


        //adição
        int somaInteiros = a + b;
        double somaDecimais = x + y;
        System.out.println("Soma de inteiros: " + somaInteiros );
        System.out.println("Soma de Decimais: " + somaDecimais);

        //Subtração
        int subtracaoInteiros = a - b;
        double subtracaoDecimais = x + y;
        System.out.println("Subtração de inteiros: " + subtracaoInteiros );
        System.out.println("Subtração de Decimais: " + subtracaoDecimais );

        //Multiplicação
        int multiplicacaoInteiros = a * b;
        double multiplicacaoDecimais = x * y;
        System.out.println("Multiplicação de inteiros: " + multiplicacaoInteiros );
        System.out.println("Multiplicação de Decimais: " + multiplicacaoDecimais );

        //Divisão
        int divisaoInteiros = a / b;
        double divisaoDecemais = x / y;
        System.out.println("A divisão dos números inteiro: " + divisaoInteiros);
        System.out.println("A divisão dos números Decimais: " + divisaoDecemais);

        //Módulo
        int restoInteiros = a % b;
        double restoDecimais = x % b;
        System.out.println("O Resto dos números inteiro: " + restoInteiros);
        System.out.println("O Resto dos números Decimais: " + restoDecimais);

        //Incremento(++)
        int incremento = a;
        incremento++;
        System.out.println("Incremento de a: " + incremento);

        //Decremento
        int decremento = b;
        incremento--;
        System.out.print("Decremento de b " + decremento);

        //Exemplo de expressão com multiplos operadores
        double resultadoComplexo = (x * y) * (a-b)/2;
        System.out.println("O resultado Complexo é: " + resultadoComplexo);
    }
}
