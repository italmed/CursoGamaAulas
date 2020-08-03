package aula02.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // lógica OU, utilziar ||
        // lógica E, utilziar &&
        // lógica NÃO, utilizar !

        Scanner entrada = new Scanner(System.in);

        int ladoA, ladoB, ladoC;

        System.out.println("Digite o lado A do triângulo:");
        ladoA = entrada.nextInt();
        System.out.println("Digite o lado B do triângulo:");
        ladoB = entrada.nextInt();
        System.out.println("Digite o lado C do triângulo:");
        ladoC = entrada.nextInt();

        if ((ladoA > (ladoB + ladoC)) || (ladoB > (ladoA + ladoC)) || (ladoC > (ladoA + ladoB))) {
            System.out.println("Dados não formam um triângulo.");
        } else if ((ladoA == ladoB) && (ladoB == ladoC)) {
            System.out.println("Este é um triângulo Equilátero.");
        } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoC == ladoB)) {
            System.out.println("Este é um triângulo isósceles.");
        } else {
            System.out.println("Este é um triângio escaleno.");
        }

        entrada.close();

    }
}