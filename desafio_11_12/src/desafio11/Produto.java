package desafio11;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    private double precoAtualizado = preco;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;


    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public Double aplicarDesconto (double percentual){
        return (precoAtualizado * percentual) / 100;
    }

    @Override
    public String toString(){
        return "nome: " + nome + "| preço: " +  preco + "| Quantidade: " +  quantidade + "| preço atualizado: " + precoAtualizado;
    }
}
