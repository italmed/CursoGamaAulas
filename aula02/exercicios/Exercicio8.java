package aula02.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Digite o salário para calculo de INSS: ");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.printf("Isento");
        } else {
            if (salario <=1200) {
                System.out.printf("Imposto de 20%%: R$ %.2f", (salario * 0.2f));
            }
            else {
                if (salario <= 2000) {
                    System.out.printf("Imposto de 25%%: R$ %.2f", (salario * 0.25f));
                }
                else {
                    System.out.printf("Imposto de 30%%: R$ %.2f", (salario * 0.3f));
                }
            }
        }
        
        entrada.close();
    }

}
