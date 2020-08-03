package aula02.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, notaExame, media;
        int faltas;

        System.out.println("Digite a quantidade de faltas do aluno: ");
        faltas = entrada.nextInt();

        if (faltas >= 16) {
            System.out.println("Este aluno atingiu o limite de faltas e foi reprovado.");
        } else {

            System.out.println("Digite a nota 1: ");
            nota1 = entrada.nextFloat();
            System.out.println("Digite a nota 2: ");
            nota2 = entrada.nextFloat();
            System.out.println("Digite a nota 3: ");
            nota3 = entrada.nextFloat();
            System.out.println("Digite a nota 4: ");
            nota4 = entrada.nextFloat();

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 6) {
                System.out.println("Aluno aprovado por nota!");
            } else {
                System.out.printf("Este aluno não obteve a nota mínima para passar direto (média: %.1f)\n", media);
                System.out.printf("Para passar no exame, o aluno precisa de uma nota %.1f, no mínimo.\n\n", (10 - media));
                System.out.println("Digite a nota do Exame: ");
                notaExame = entrada.nextFloat();
                media = (media + notaExame) / 2;
                if (media >= 5) {
                    System.out.printf("Aluno aprovado no exame (média: %.1f) ", media);
                } else {
                    System.out.printf("Aluno reprovado por nota (média: %.1f) ", media);
                }
            }
        }
        entrada.close();

    }
}