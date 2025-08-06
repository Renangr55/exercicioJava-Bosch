package desafio12;

public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean status;

    public Livro (String titulo, String autor, String ISBN, boolean status){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.status = status;

    }

    public void exibir(){
        System.out.format("titulo do livro: %s | autor do livro: %s | ISBN: %s | status: %b",titulo,autor,ISBN,status);

    }

    // retornando atributos
    public String getTitulo(){
        return this.titulo;
    }



    public String getAutor(){
        return autor;
    }

    public String getISBN(){
        return ISBN;
    }


    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    @Override
    public String toString(){
        return  "titulo do livro: " + getTitulo() + "| Nome do autor: " + autor + "| ISBN: " + ISBN + "| Status: " + status;
    }




}
