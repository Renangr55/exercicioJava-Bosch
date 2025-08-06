package desafio11;

public class Cliente {

    String nome;
    String email;

    public Cliente (String email, String nome){
        this.email = email;
        this.nome = nome;
    }

    public void mostrarDados(){
        System.out.println("Nome do cliente: " + nome + "| Email do cliente: " + email);
    }
}
