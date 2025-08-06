package array;
//Exercício 3: Ordenação Crescente
//Implemente um algoritmo que leia um array de números inteiros e o ordene em ordem crescente (sem usar as bibliotecas prontas de ordenação).
public class ex3 {
    public static void main(String[] args) {

        int[] numeros = {5, 1, 9, 3}; // Array de números a ser ordenado
        int tamanho = numeros.length;



        for(int i = 0; i < tamanho - 1; i++) {
           for (int j = 0; j < tamanho - i - 1; j++) {
               if (numeros[j] < numeros[j + 1]) {
                   int temp = numeros[j];
                   numeros[j] = numeros[j+1];
                   numeros[j+1] = temp;
               }
           }
        }
        for (int i = 0; i < tamanho; i++){
            System.out.println(numeros[i]);
        }


    }
}
