public class studying_methods {


    /* methods
    static void Hi (String name){
        System.out.println(" Hello " + name);
    }


    // função que retorna um resultado inteiro
    static int soma (int a, int b){
        return a + b;
    }

    static double somaDouble (double a, double b) {
        return a + b;
    }
    end method
    */

    static int sum (int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // a = 0   b = 1   c = a + b


    static int fibbonaci (int a){
        if (a == 0){
            return 1;
        } else if (a == 1) {
            return 1;
        } else {
            return fibbonaci(a - 1) + fibbonaci(a - 2);
        }
    }



    public static void main(String[] args) {

        // method Scope
        {
            int x = 100;
            System.out.println(x);

        }



        /*
        Hi("renan");
        Hi("laura");
        Hi("kaka");
        Hi("neymar");
        Hi("messi");
        Hi("cr7");

        int numero1 = soma(10,20);
        System.out.println("a soma dos numeros inteiros: " + numero1 );

        double numero2 = somaDouble(2.4,9.9);
        System.out.println("a soma dos números double são: " + numero2 );
        */

        int sumTest = sum(10);
        System.out.println(sumTest);


        int javaaa = fibbonaci(10);
        System.out.println(javaaa);
    }


}
