package aula01;

import java.util.Scanner;

public class Sample06 {
    public static void main(String[] args) {
        
        // entrada de dados

        Scanner entrada = new Scanner(System.in);
        int idade;
        float peso;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Digite seu peso: ");
        peso = entrada.nextFloat();

        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Seu peso é: " + peso + " kg");

        entrada.close();

    }
}