package exercicios_entrda_saida;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
    //Uma companhia de carros paga a seus empregados um salário de R$ 1500,00 por mês
        //mais uma comissão de R$ 350,00 para cada carro vendido e mais 0,001% do valor total
        //das vendas da loja naquele mês. FUP que calcule o salário do vendedor num dado mês
        //recebendo como dados de entrada o nome do vendedor, o mês, o número de carros
        //vendidos por ele e o valor total das vendas. Faça uma saída de dados adequada ao
        //vendedor, mostrando os dados informados e calculados.
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Digite o mês: ");
        String mes = scanner.nextLine();

        float salarios = 1500;
        double comissão = 350;


        System.out.print("Digite o números de carros que ele vendeu: ");
        int numerosCarros = scanner.nextInt();

        double commissaoVenda = comissão * numerosCarros;
        double salario_comissao = salarios + commissaoVenda;
        double porcentagem = salario_comissao * 0.001;
        double salarioTotal = salario_comissao + porcentagem;

        System.out.println(porcentagem);
        System.out.println("o nome do vendedor é: " + nomeVendedor + " - o mes que ele vendeu foi: " + mes + " - a quantidades de carros que ele vendeu foi: " + numerosCarros + " - a comissão foi de: " + commissaoVenda + " - o salário com comissão foi: " + salario_comissao + " - o salário total foi: " + salarioTotal);







    }
}
