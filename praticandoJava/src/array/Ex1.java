package array;

//Exercício 1: Soma dos Elementos de um Array
//Crie um programa que leia um array de inteiros e calcule a soma de todos os elementos desse array.
//
//Dica: Você pode usar um laço for para iterar pelos elementos do array
public class Ex1 {
    public static void main(String[] args) {

        int somador = 0;
        int [] numbers = {10,20,30,40,50};
        for (int i:numbers){
            somador += i;
        }
        System.out.println(somador);
    }
}
