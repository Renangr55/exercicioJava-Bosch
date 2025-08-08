package desafio11;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    private double porcentagem;

    private double precoAtualizado;
    private double precoComDescontoUnitario;

    public Produto(String nome, double preco, int quantidade,double porcentagem){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.porcentagem = porcentagem;



    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public Double getPorcentagem(){
        return porcentagem;
    }

    public int getQuantidade(){
        return quantidade;
    }



    public double getPrecoComDesconto(){ //caluculando preço de apenas 1 valor
        double conversao = porcentagem / 100;
        precoAtualizado =  preco * conversao;
        return precoAtualizado;
    }
    public double getPrecoComDescontoUnitario(){
        return preco * (1 - porcentagem / 100.0) * quantidade; //caluculando preço unitário de cada produto
    }


    @Override
    public String toString(){
        return "nome: " + nome + "| preço: " +  preco + "| Quantidade: " +  quantidade + "| valor com desconto sem ser unitario: " + getPrecoComDesconto() ;
    }
}
