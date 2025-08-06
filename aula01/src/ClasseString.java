public class ClasseString {


    //Códigos ANSI para as cores
    public static final String RESET = "\033[0m";     //Resetando as cores
    public  static final String VERMELHO = "\033[31m";
    public  static final String VERDE ="\033[32m";
    public static final String AMARELO = "\033[33m";    // Amarelo
    public static final String AZUL = "\033[34m";       // Azul
    public static final String ROXO = "\033[35m";       // Roxo
    public static final String CIANO = "\033[36m";      // Ciano
    public static final String BRANCO = "\033[37m";     // Branco

    // Códigos ANSI para as cores de fundo
    public static final String FUNDO_VERMELHO = "\033[41m";   // Fundo Vermelho
    public static final String FUNDO_VERDE = "\033[42m";      // Fundo Verde
    public static final String FUNDO_AMARELO = "\033[43m";    // Fundo Amarelo
    public static final String FUNDO_AZUL = "\033[44m";       // Fundo Azul
    public static final String FUNDO_ROXO = "\033[45m";       // Fundo Roxo
    public static final String FUNDO_CIANO = "\033[46m";      // Fundo Ciano
    public static final String FUNDO_BRANCO = "\033[47m";     // Fundo Branco



    public static void main (String[]args){
        //Exemplificando com operadores lógicos: &&(AND,| | (OR)), ! (NOT)
        boolean condicao1 = true;
        boolean condicao2 = false;
        //Operadores lógicos
        System.out.println("Resultado do opredaor AND (&&):" + (condicao1 && condicao2)); //Falso
        System.out.println("Resultado do opredaor OR (&&):" + (condicao1 || condicao2)); //Verdadeiro
        System.out.println("Resultado do opredaor NOT (&&):" + !condicao1 ); //Falso

        //Usando opreadores de incremento e decremento
        int numero = 10;

        //Incrementado (pós_fixado)
        numero++; // Incremento pós fixado
        System.out.println("Incremento pos fixado: "+ numero);

        //Decrementando( pos - fixado )
        numero--; //decremento pós-fixado
        System.out.println("Decremento pós fixado: " + numero);

        //Operadores de incremento e decremento pré-fixado
        System.out.println("Incremento pré-fixado" + ++numero);
        System.out.println("decremento pré-fixado" + --numero);

        //operador ternário
        String resultado = (numero > 5) ? "Maior que 5 " : "menor igual a 5";
        System.out.println(VERDE + "Resultados do operador ternário: " + resultado);

        //Trabalhando com string
        //Criando uma String diretamente
        String texto = "java 'e uma linguagem poderosa! ";
        //Usando o método charAt para acessar um caractere na posição 5 (indice começa em 0 )
        char caractere = texto.charAt((5)); // Vai pegar o caractere na posição 5 (indice começa em 0)
        System.out.println(FUNDO_AMARELO + AZUL +  "Caractere na posição 5: "+  caractere + RESET); // vai imprimir 'e'

        //usando o método Startswith para verificar se a String começa comum prefixo
        boolean comecaComJava = texto.startsWith("Java");
        System.out.println(BRANCO + "A String termina com 'Java!'? " + comecaComJava);

        //Usando o método endsWith para verificar se a string termina com um sufixo
        boolean terminaComPoderosa = texto.endsWith("poderosa!*");
        System.out.println(CIANO + "A String termina com 'poderosa!'?" + terminaComPoderosa);

        //Convertendo a String para letra maisculas com ttoUpperCase
        String textoMaiusculo = texto.toUpperCase();
        System.out.println(ROXO + "Texto em maisculas: " + textoMaiusculo);

        //Convertendo a String para letras minusculas com tolowercase
        String textoMinusculo = texto.toLowerCase();
        System.out.println(AZUL + "Texto em minusculas: "+ textoMinusculo);

        //Usando o equals para comparar String
        String textoComparar = "Java é uma linguagem poderosa!*";
        boolean saoIguais = texto.equals(textoComparar); // Verifica se os dois textos são iguais
        System.out.println(AMARELO + "As duas Strings são iguais? " + saoIguais );


        //Usando a concatenação de string

        String concatenado = texto + "" + textoComparar;
        System.out.println(VERDE + "Texto concatenando: " + concatenado);

        //


    }
}
