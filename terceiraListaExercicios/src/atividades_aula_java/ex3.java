package atividades_aula_java;

import java.util.Scanner;

public class ex3 {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de gols do primeiro time:  ");
        int golsTime = scanner.nextInt();

        System.out.print("Digite a quantidade dos gols do segundo time: ");
        int gols_segundo_time = scanner.nextInt();

        if (golsTime > gols_segundo_time) {
            System.out.printf("O primeiro time ganhou: %d X %d", golsTime,gols_segundo_time);
        } else if (gols_segundo_time > golsTime) {
            System.out.printf("O segundo time ganhou: %d X %d", gols_segundo_time,golsTime);
        } else {
            if (golsTime == gols_segundo_time || gols_segundo_time == golsTime){
                System.out.printf("Os times empataram %d x %d", golsTime,gols_segundo_time);
            } else {
                System.out.println("Deu erro!!!");
            }
        }
    }
}
