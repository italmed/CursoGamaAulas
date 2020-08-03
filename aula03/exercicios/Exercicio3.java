package aula03.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, cont;
        cont = 1;

        System.out.print("Digite um número inteiro qualquer: ");
        num = entrada.nextInt();
        System.out.print("Sequencia impressa: ");

        while (cont <= num) {
            if (cont == 1){
                System.out.printf("%d", cont);
                cont = cont*2;
            } 
            else {
                System.out.printf(", %d", cont);
                cont = cont*2;
            }
        }

        entrada.close();
    }
}