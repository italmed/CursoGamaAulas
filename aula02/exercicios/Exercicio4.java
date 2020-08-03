package aula02.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao, relacao;

        System.out.println("Digite o salário: ");
        salario = entrada.nextFloat();
        System.out.println("Digite o valor da prestação: ");
        prestacao = entrada.nextFloat();
        
        relacao = prestacao / salario;

        if (relacao > 0.3) {
            System.out.println("Crédito negado! Prestação ultrapassa limite de 30% do salário.");
        }
        else{
            System.out.println("O crédito pode ser concedido! Prestação abaixo dos 30%.");
        }
        entrada.close();
    }
}