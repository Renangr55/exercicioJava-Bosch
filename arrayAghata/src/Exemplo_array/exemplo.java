package Exemplo_array;

public class exemplo {

    public static void main(String[] args) {
        String [] soccerTeams = {"Palmeiras","Corinthias","São paulo","Santos"};

        int contadorP = 0;
        int contadorC = 0;
        int contadorS = 0;
        for (int i = 0; i < soccerTeams.length;i++){
            String teste = soccerTeams[i];

            if (teste.startsWith("P")) {
                contadorP++;
            }

            if (teste.startsWith("C")) {
                contadorC++;
            }

            if (teste.startsWith("S")) {
                contadorS++;
            }

        }
            System.out.println("a quantidade de times com a letra P: " + contadorP);
            System.out.println("a quantidade de times com a letra P: " + contadorC);
            System.out.println("a quantidade de times com a letra P: " + contadorS);
    }
}
