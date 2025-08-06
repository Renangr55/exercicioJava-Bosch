import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Produto maca = new Produto("Maça",10.00);
        maca.exibirInfo();

        Cliente primeiroCliente = new Cliente("Renan","renan@gmail.com");
        primeiroCliente.mostrarDados();

        Carrinho carrinho = new Carrinho(maca);
        System.out.printf("nome: " + carrinho.getNomeProduto() );

        carrinho.exibindoArray();
    }
}

class Produto{

    String nomeProduto;
    double precoProduto;

    public Produto(String nomeProduto, double precoProduto){
        System.out.println("Produto criado");
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto(){
        return  precoProduto;
    }


    public void exibirInfo (){
        System.out.printf("nome do produto:  %s \npreço do produto: %.2f \n", nomeProduto,precoProduto );
    }


}

class Cliente{
    String nomeCliente;
    String email;

    public Cliente(String nomeCliente, String email){
        this.nomeCliente = nomeCliente;
        this.email = email;
    }



    public void mostrarDados(){
        System.out.printf("nome do cliente: %s \nemail do cliente:  %s\n",nomeCliente,email);
    }


}

class Carrinho {
    public Produto produto;
    public ArrayList<String> ListaDeProdutos;
    public ArrayList<Integer> quantidadeProduto;

    public Carrinho(Produto produto){
        this.produto = produto;
        this.ListaDeProdutos = new ArrayList<>();
        this.quantidadeProduto = new ArrayList<>();

    }

    public String getNomeProduto(){
        return produto.nomeProduto;
    }

    public ArrayList<String> adcionandoNomeCarrinho(){
        ListaDeProdutos.add(produto.getNomeProduto());
        return ListaDeProdutos;
    }

    public void exibindoArray(){
        System.out.print(ListaDeProdutos);
    }

    public double getPrecoProduto(){
        return  produto.precoProduto;
    }





}
