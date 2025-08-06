package ArrayList;

import java.util.ArrayList;

public class arrayListExemploFestaDeAniversario {

    public static void main(String[] args) {
        ArrayList<String> listaDeAmigos = new ArrayList<>();
        listaDeAmigos.add("Peri");
        listaDeAmigos.add("Vitor");
        listaDeAmigos.add("Alysson");
        listaDeAmigos.add("Gabriel");

        System.out.println("amigos que vão a festa");


        for (String i : listaDeAmigos){
            System.out.println(i);
        }

        // mostrando todos os amigos
        System.out.println("Total de amigos: " + listaDeAmigos.size());

        // pegando primeiro valor pelo índice da array
        System.out.println("Total de amigos: " + listaDeAmigos.get(1));

        // Removendo um valor pelo índice da array
        System.out.println("Total de amigos: " + listaDeAmigos.remove(3));

        System.out.println("Removendo o Gabriel");

        for (String amigo : listaDeAmigos){
            System.out.println(amigo);
        }


    }


}
