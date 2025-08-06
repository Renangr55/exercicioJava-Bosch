package desafio12;

import java.util.Scanner;

public class AppBiblioteca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca plenitude = new Biblioteca();

        boolean exibrMenu = true;


        while (exibrMenu == true){
            System.out.println("1 - para cadastrar");
            System.out.println("2 - para remover livro");
            System.out.println("3 - para listar os livros");
            System.out.println("4 - para emprestar livro");
            System.out.println("5 - para devolver livro");
            System.out.println("6 - para filtrar");
            System.out.println("7 - para sair");


            System.out.println("Digte a opção que você deseja: ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    // cadastrar livros
                    System.out.println("Digite o titulo do livro: ");
                    String tituloLivroUser = scanner.next();

                    System.out.println("Digite o nome do autor: ");
                    String nomeAutor = scanner.next();

                    System.out.println("Digite o ISBN: ");
                    String isbnUser = scanner.next();

                    System.out.println("Digite o status de disponibilidade (disponível) - (indisponível): ");
                    String statusDisponibilidade = scanner.next();

                    boolean statusDisponibilidadeBolean = true;

                    // indicando valor boleano
                    if (statusDisponibilidade.equalsIgnoreCase("indisponível")){
                        statusDisponibilidadeBolean = false;

                    } else if (statusDisponibilidade.equalsIgnoreCase("disponivel")) {
                        statusDisponibilidadeBolean = true;
                    }


                    try{
                        plenitude.cadastrarLivro(tituloLivroUser, nomeAutor, isbnUser,statusDisponibilidadeBolean);
                    } catch (Exception e){
                        System.out.println("Deu erro em alguma coisa");
                    }

                    break;

                case 2:
                    // remover livro
                    try {
                        System.out.println("Digite o título do livro: ");
                        String tituloLivro = scanner.next();

                        plenitude.removerLivro(tituloLivro);

                    } catch (Exception e){
                        System.out.println("Deu erro");
                    }
                    break;

                case 3:
                    // listar livro
                    plenitude.listarLivro();
                    break;

                case 4:
                    // emprestar livro
                    try {
                        System.out.println("digite o ISBN do livro que você deseja: ");
                        String ISBN = scanner.next();
                        plenitude.emprestarLivro(ISBN);
                    } catch (Exception e){
                        System.out.println(" ------ Deu errado -------- ");
                    }
                    break;

                case 5:
                    // devolver livro
                    try {
                        System.out.println("Digite o ISBN do livro que você deseja devolver: ");
                        String ISBN = scanner.next();
                        plenitude.devolverLivro(ISBN);
                    } catch (Exception e){
                        System.out.println("Deu algum erro");
                    }
                    break;
                case 6:
                    System.out.println("Digite o título do livro: ");
                    String tituloLivro = scanner.next();

                    System.out.println("Digite o nome do autor do livro");
                    String autor = scanner.next();

                    plenitude.filtarLivro(tituloLivro,autor);
                    break;

                case 7:
                    System.out.println("Muito por ter acessado nosso sistema, volte sempre");
                    exibrMenu = false;
                    break;
            }
        }





        plenitude.listarLivro();


    }
}
