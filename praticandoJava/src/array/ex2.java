package array;
//Exercício 2: Maior e Menor Elemento
//Crie um programa que leia um array de inteiros e encontre o maior e o menor número dentro dele.
//
//Dica: Utilize duas variáveis para armazenar o maior e o menor valor enquanto percorre o array.
public class ex2 {
    public static void main(String[] args) {


        int biggestNumber = 0; // posso usar Integer.MIN_VALUE;
        int smallestNumber = 150; //Posso usar Integer.MAX_VALUE;
        int [] numbers = {10,20,30,40,50};

        for (int i: numbers) {
            if (biggestNumber < i) {
                biggestNumber = i;
            }


            if (smallestNumber > i) {
                smallestNumber = i;
            }

        }
        System.out.println("O maior número dessa lista é: " + biggestNumber);
        System.out.println("O menor número dessa lista é: " + smallestNumber);


    }




}
