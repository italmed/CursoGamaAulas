package aula02.exercicios;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio1 {

    public static void main(String[] args) {
        int num;
        float metade;

        Scanner entrada = new Scanner(System.in);

        System.out.println(("Digite um número: "));
        num = entrada.nextInt();
        metade = (float)num / 2;
        if (num > 20) {
            System.out.printf("O número digitado é %d e sua metade é %.1f.\n", num, metade);
        }

        entrada.close();
    }
}