public class lacoWhile2 {

    public static void main (String[] args) {
        int contadorAtual = 0;
        int total = 0;

        while (contadorAtual <= 10) {

            total = total + contadorAtual;

            System.out.println(total);
            contadorAtual++;


        }
        int contador = 0;

        while (contador <= 20) {
            System.out.printf("o contador está em %d\n", contador);
            contador++; //Incrementando número no contador
        }
    }
}
