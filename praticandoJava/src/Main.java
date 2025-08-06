import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       // String txt = "QWERTYUIOPÇLKJHGFDSAZXCVBNM";
       // System.out.println("the lenght of string is " + txt.length());

        Scanner scanner = new Scanner(System.in);

        String name = "Renan Gabriel Rodrigues Mendonça";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());


        String text = "talking-me about a locate";
        //System.out.println(text.indexOf("locate"));

        //concat method is used wifh two strings
        //System.out.println(name.concat(text));


        // raiz quadrada
        System.out.println( Math.sqrt(64));
        // retora um numero psoitivo
        System.out.println(Math.abs(-90));
        // retorna um numero aleatório
        System.out.println( Math.random());
        // numero aleatorio menor que 100
        int randon = (int)(Math.random() * 1);
        System.out.println(randon);

        /* int x = 10;
        int y = 20;
        System.out.println(x > y);

        String result = (x > 10) ? "é  verdade" : "Te digo mentira";
        System.out.println(result);

        int i = 10;
        int r = 10;
        do {
            System.out.println(i);
            i--;

        } while( i > 0);

        while (r > 0) {
            System.out.println(r);
            r--;
        }



        System.out.print("Insira o numero da tabuada: ");
        int tabuada = scanner.nextInt();

        for(int i = 0; i <= 10; i++) {
            System.out.println( tabuada + " x " + i + " = " + (tabuada * i));

        }
        */

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        int [] myNubers = {1,2,3,4,5,6,7,8,9,10};
        for (int i : myNubers) {
            System.out.println(i);
        }













    }
}