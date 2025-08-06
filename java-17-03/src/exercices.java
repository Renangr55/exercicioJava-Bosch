public class exercices {

    static int contagemRegressiva(int a) {
        while (a >= 0) {
            System.out.println(a);
            a--;

        }
        return a;
    }


    static int soma (int a, int b) {
        if (a == b) {;
        }
        return a + b;
    }
    public static void main (String[] args) {



        int teste = contagemRegressiva(66);
        System.out.println(teste);

        try {
            int test = soma(10,20);
            System.out.println(test);
        } catch (Exception e){
            System.out.println("esta dando erro,por causa dos tipos do números");
        } finally {
            System.out.println("the end");
        }
    }



}
