public class DESAFIO_MATH {


    public static void main (String[] args) {
        double base = -3;
        double expoente = -2;
        double desafio = ((3) * (- base / 4.0 )  + (6)  * 3 - 1 / 4.0) - (4.0) / (7 * (- 3 / 4.0) + 2);


        double resultado = Math.pow(base, expoente);

        System.out.printf("Resultado da expressão:  %.4f\n" , desafio);
        System.out.printf("Resultado da base elevada ao expoente: %.4f " , resultado);

    }
}
