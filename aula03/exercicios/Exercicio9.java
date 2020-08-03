package aula03.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int digitado, soma, positivos;
        float media;
        soma = 0;
        positivos = 0;

        for (int i = 1; i <=10; i++){
            System.out.printf("Digite o %dº número: ", i);
            digitado = entrada.nextInt();
            if (digitado>0){
                positivos++;
            }
            soma += digitado;
        }
        media = (float)soma/10;

        System.out.printf("\nA soma dos números é %d\n", soma);
        System.out.printf("A média dos números é %.1f\n", media);
        System.out.printf("A qntd de números positivos é %d\n", positivos);
        System.out.printf("Os números positivos correspondem a %.1f%%\n\n", ((float)positivos/10)*100);

        entrada.close();
    }
    

}