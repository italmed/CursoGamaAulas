package aula03.exercicios;

import java.util.Scanner;

public class Exercicio5 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num, in, cont;
    num = 0;
    in = 1;
    cont = 1;

    while (in != 0){
        System.out.printf("Digite o %dº número: ", cont);
        in = entrada.nextInt();
        num = num + in;
        cont++;
    }
    System.out.printf("\nDigitado o número 0.\nA soma dos números é: %d\n\n", num);
    entrada.close();
    }
   
}