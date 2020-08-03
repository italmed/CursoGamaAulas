package aula03.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num, cont;
        cont = 0;
        
        System.out.print("Digite um núero para calcular a tabuada: ");
        num = entrada.nextInt();

        while (cont <=10){
            System.out.printf("%d x %d = %d\n", num, cont, (num*cont));
            cont++;
        }
        
        entrada.close();
    }
}