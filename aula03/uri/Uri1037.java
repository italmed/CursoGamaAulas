package aula03.uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor;
        String mensagem;
        valor = entrada.nextFloat();

        if (valor < 0){
            mensagem = "Fora de intervalo";
        } else if (valor >= 0 && valor <= 25) {
            mensagem = "Intervalo [0,25]";
        } else if (valor <= 50) {
            mensagem = "Intervalo (25,50]";
        } else if (valor <= 75) {
            mensagem = "Intervalo (50,75]";
        } else if (valor <=100) {
            mensagem = "Intervalo (75,100]";
        } else {
            mensagem = "Fora de intervalo";
        }

        System.out.print(mensagem);
        entrada.close();
    }
}
