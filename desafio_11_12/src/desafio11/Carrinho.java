package desafio11;


import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {

    Scanner test = new Scanner(System.in);
    private final ArrayList<Produto>produtos;

    static double total = 0;

    public Carrinho(){

        produtos = new ArrayList<>();

    }



    public void AdicionarProduto(String nomeProduto, double preco, int quantidade) {

        Produto produto = new Produto(nomeProduto, preco, quantidade);
        produtos.add(produto);


        System.out.println("Deseja aplicar desconto: (S/N) ");
        String desconto = test.next();


        System.out.println("Digite o porcentual: ");
        double aplicarValorAtualizado = test.nextDouble();
        produto.aplicarDesconto(aplicarValorAtualizado);

    }

    public void mostarResumo(){
        for (Produto i : produtos){
            total += i.getPreco() * i.getQuantidade();
            System.out.println(i);
        }
        System.out.println("total compra: " + total);
    }

    public Produto buscar(String nomeProduto){
        for (Produto i:produtos){
            if (i.getNome().equalsIgnoreCase(nomeProduto)){
                return i;
            }
        }
        return null;
    }

    public void removerProduto(String nomeProduto){
        try {
            Produto produto = buscar(nomeProduto);
            produtos.remove(produto);
            System.out.println("Produto removido");
        } catch (Exception e){
            System.out.println("deu erro em remover");
        }



    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Cliente renan = new Cliente("renan.mewekd2k017@gmail.com","Renan");

        Carrinho ecommerce = new Carrinho();

        boolean status = true;

        while(status != false){
            System.out.println("- 1 adicionar produto ");
            System.out.println("- 2 remover produto ");
            System.out.println("- 3 listar produto");
            System.out.println("- 4 sair");

            System.out.println("Digite a opção que você deseja: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = sc.next();

                    System.out.println("Digite o preço do produto");
                    double precoProduto = sc.nextDouble();

                    System.out.println("Digie a quantidade do produto");
                    int quantidadeProduto = sc.nextInt();

                    ecommerce.AdicionarProduto(nomeProduto,precoProduto,quantidadeProduto);




                    break;
                case 2:
                    System.out.println("Digite o nome do produto: ");
                    String nomeProdutoRemove = sc.nextLine();

                    ecommerce.removerProduto(nomeProdutoRemove);

                    break;

                case 3:
                    ecommerce.mostarResumo();
                    break;
                case 4:
                    status = false;
                    System.out.println("Operação encerrada");
                    break;
                default:
                    System.out.println("Operação finalizada");
            }


        }

    }
}
