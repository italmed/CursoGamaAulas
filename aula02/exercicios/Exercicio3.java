package aula02.exercicios;


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1, num2;

        System.out.println("Escreva o primeiro número:");
        num1 = entrada.nextFloat();
        System.out.println("Escreva o segundo número:");
        num2 = entrada.nextFloat();

        if (num1 > num2) {
            System.out.printf("Números em ordem descrescente: %.2f, %.2f\n", num1, num2);
        }
        else if (num2 > num1){
            System.out.printf("Números em ordem descrescente: %.2f, %.2f\n", num2, num1);
        }
        else {System.out.println("Numeros iguais.");}

        entrada.close();
    }
}