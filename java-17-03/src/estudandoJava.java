import java.util.Scanner;
public class estudandoJava {


    static void myFuction(){
        System.out.println("I like to go to the gym");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System. in);

        for (int j = 1; j <= 2; j++) {
            System.out.println("OUTER" + j);

            for (int i = 1; i <= 2; i++){
                System.out.println("Inner" + j);
            }
        }

        // for-each
        String[] cars = {"Volvo", "corsa", "ford"};
            for (String i : cars) {
                System.out.println(i);
            }

        int[] numbers = {10,20,30,40};
            for (int k : numbers){
                System.out.println(k);
            }



        /*
        for (type variableName : arrayName) {
        // code block to be executed
        }

        int [] numeros = {10,20,30,40,50};

        int soma = 0;

        for (int i : numeros) {
            soma += i;
            System.out.println(soma);


        int [] numeros = {10,-1,-2,-3,30};

        int count = 0;

        for (int k : numeros){
            if (k < 0)  {
                count ++;


            }

        }
        System.out.println(count);



        String names[] = {"renan","alyson","Gabriel","laura","pablo"};
        System.out.println(names[0].toUpperCase());
        names[0] = "laura";
        System.out.println(names[0]);
        for (String j : names) {
            System.out.println(j);
        }
        }*/


        int [][] myNumbers = {{1,2,3,4,5,6,7,8,9,10}, {11,12,13,14,15,16}};
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }


        }

        String [][] myStrings = {{"one","two","three","four","five","six"}, {"seven","eight","nine","ten"}};
        for (int i = 0; i < myStrings.length; i++ ) {
            for (int j = 0; j < myStrings[i].length; ++j) {
                System.out.println(myStrings[i][j]);
            }
        }









    }










}
