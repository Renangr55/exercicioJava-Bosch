package desafio12;
import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {

    Scanner scanner = new Scanner(System.in);
    private final ArrayList<Livro> livros;


    public Biblioteca() {
        livros = new ArrayList<>();

    }

    // cadastrar Livro
    public void cadastrarLivro(String tituloLivro, String nomeAutor, String ISBNuser, boolean statusLivro ) {
        try {
            Livro livrouser = new Livro(tituloLivro, nomeAutor, ISBNuser, statusLivro);
            livros.add(livrouser);



            if (livros.contains(livrouser)){
                System.out.print("Livro cadastrado \n _____________ \n");
            } else {
                System.out.println("Deu erro");
            }
        } catch (Exception e){
            System.out.println("Deu algum problema");
        }
    }

    public Livro buscarLivro(String isbn){
        for (Livro livro : livros){
            if (livro.getISBN().equalsIgnoreCase(isbn)){
                return livro;
            }
            System.out.println("livro não encontardo");
        }
        return null;
    }

    public void emprestarLivro(String ISBNuser){
        Livro livroUser = buscarLivro(ISBNuser);
        if (livroUser.getStatus()){
            System.out.println(" ------- O livro está dísponivel para ser emprestado -----");

            if (livroUser.getISBN().equals(ISBNuser)){
                System.out.println("Você pegou o livro: " + livroUser.getTitulo() +
                        "| Autor: " + livroUser.getAutor() +
                        "| ISBN: " + livroUser.getISBN() +
                        "| Status de disponibilidade: " + livroUser.getStatus());
                livroUser.setStatus(false);

                System.out.println("Operação de empréstimo concluida");
            } else {
                System.out.println("Livro não encontrado");
            }
        } else {
            System.out.println("O livro está sendo usado, volte mais tarde");
        }


    }

    public void devolverLivro(String ISBNuser){
        Livro livroUser = buscarLivro(ISBNuser);
        if (!livroUser.getStatus()){
            System.out.println(" -------- o livro está sendo usado ---------");

            if (livroUser.getISBN().equals(ISBNuser)){
                System.out.println("Você devolveu o livro: " + livroUser.getTitulo() +
                        " Autor: " + livroUser.getAutor() +
                        "ISBN: " + livroUser.getISBN() +
                        "Status de disponibilidade: " + livroUser.getStatus());
                livroUser.setStatus(true);

                System.out.println("Operação de devolução concluida");
            } else {
                System.out.println("Livro não encontrado");
            }
        } else {
            System.out.println("O livro não está sendo usado, volte mais tarde");
        }


    }


    //Buscar livro
    public void filtarLivro(String tituloLivro, String nomeAutor) {

        System.out.println("deseja filtar por título ou autor(t/a): ");
        String respostaUsuario = scanner.nextLine();



        if (respostaUsuario.equalsIgnoreCase("t")){
            try{
                System.out.println(" --------- Filtrando livro por titulo --------");
                Livro livroUser = buscarLivro(tituloLivro);
                System.out.println("titulo do livro: " + livroUser.getTitulo() + " ISBN: " + livroUser.getISBN() + "\n");
            } catch (Exception e){
                System.out.println("não foi encontrado");

            }

        } else if (respostaUsuario.equalsIgnoreCase("a")) {
            try {
                System.out.println("Filtrando livro por autor");
                Livro livroUser = buscarLivro(nomeAutor);

                System.out.println(" titulo do livro: " + livroUser.getTitulo() + " ISBN: " + livroUser.getISBN());
            } catch (Exception e){
                System.out.println("Não foi encontrado");
            }

        }






    }

    // remover livro
    public void removerLivro(String nomeLivro) {
        try {
            Livro livroUser = buscarLivro(nomeLivro);
            livros.remove(livroUser);
            System.out.println("---- livro removido -----");

        } catch (Exception e){
            System.out.println("Deu erro!!!");
        }


    }

    // listar livro
    public void listarLivro() {
        try {
            if (livros.isEmpty() || livros.size() == 0) {
                System.out.println("Lista sem resgistros");
            } else {
                System.out.println("______________________");
                System.out.println("Listando Livros");
                for (Livro livro : livros) {
                    System.out.println(livro);

                }
                System.out.println("________________________");
            }

        } catch (Exception e) {
            System.out.println("Ocorreu algum erro");


        }

    }


}
