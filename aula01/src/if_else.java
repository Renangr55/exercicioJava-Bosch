public class if_else {

    public static void main(String[] args) {
        double media = 7.1;
        int faltas = 20;
        boolean postura = true;
        String situacao;

        //estrutura condicional if-else que avalia a situação do aluno com base na média , FALTAS E POSTURA
        //Se a média for maior ou igual a 5.0,o número de faltas for menor que 25 e a apostura positiva

        if (media >= 5.0 && faltas < 25 && postura == true){
            situacao = "Aprovado";
        } else if (media < 5 && faltas < 25 && postura) {
            situacao = "recuperação";
        } else if (media < 5 && faltas < 25 && postura) {
            situacao = "Sem férias";
        } else if (media < 5.0 && faltas < 25 && postura == false) {
            situacao = "Chamar para conversar";
        }
        else {
            situacao = "Reprovado";
        }
        System.out.println(situacao);
    }


}


