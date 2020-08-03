package aula03.uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salario, imposto;
        salario = entrada.nextFloat();

        if (salario <= 2000){
            imposto = 0;
        } else if (salario <= 3000){
            imposto = (salario - 2000) * 0.08f;
        } else if (salario <= 4500){
            imposto = ((salario - 3000) * 0.18f) + (1000 * 0.08f);
        } else {
            imposto = ((salario - 4500) * 0.28f) + (1500 * 0.18f) + (1000 * 0.08f);
        }

        if (imposto == 0){
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", imposto);
        }

        entrada.close();
    }
}