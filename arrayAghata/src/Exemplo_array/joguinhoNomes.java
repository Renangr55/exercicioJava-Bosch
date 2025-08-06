package Exemplo_array;

public class joguinhoNomes {
    public static void main(String[] args) {
        String[] amigos = {"Renan","cauan","alysson","Carol","pedro"};

        int contadorA = 0;

        for (int i = 0; i < amigos.length; i++){
            String nome = amigos[i];

            if (nome.startsWith("A")){
                contadorA++;
            }
        }

        System.out.println("Quantidade de nomes que começam com a letra A" + contadorA);
    }
}
