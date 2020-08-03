package aula03.uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salarioAtual, salarioNovo, reajuste, reajusteGanho;

        salarioAtual = entrada.nextFloat();

        if (salarioAtual <= 400) {
            reajuste = 0.15f;
        } else if (salarioAtual <= 800) {
            reajuste = 0.12f;
        } else if (salarioAtual <=1200) {
            reajuste = 0.1f;
        } else if (salarioAtual <= 2000) {
            reajuste = 0.07f;
        } else {
            reajuste = 0.04f;
        }

        salarioNovo = salarioAtual * (1+reajuste);
        reajusteGanho = salarioAtual * reajuste;
        reajuste = reajuste * 100;
        
        System.out.printf("Novo salario: %.2f\n", salarioNovo);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.printf("Em percentual: %.0f %%\n", reajuste);

        entrada.close();
    }
}