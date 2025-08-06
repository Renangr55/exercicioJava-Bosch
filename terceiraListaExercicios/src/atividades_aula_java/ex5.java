package atividades_aula_java;

import java.net.SocketOption;

public class ex5 {
    public static void main (String[] args) {

        int quantidadeAtual = 30;
        System.out.printf("\n a quantidade atual do estoque é %d",quantidadeAtual);

        int quantidadeMaxima = 50;
        System.out.printf("\n a quantidade máxima do estoque é %d",quantidadeMaxima);


        int quantidadeMinima = 10;
        System.out.printf("\n a quantidade mínima do estoque é %d ",quantidadeMinima);



        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
        System.out.printf("\n a quantidade média do estoque é %d",quantidadeMedia);



        if(quantidadeAtual >= quantidadeMinima) {
            System.out.print("\n por favor!! não efetuar a compra");
        } else {
            System.out.print("Efetuar a compra");
        }

    }
}
