// leia um salário e aplique aumento de 25%

package aula01;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        float salarioAtual;
        float porcentagemAumento;
        float salarioAjustado;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o salário atual do funcionário?");
        salarioAtual = entrada.nextFloat();

        System.out.println("Qual aumento será aplicado, em %? ");
        porcentagemAumento = entrada.nextFloat()/100;
        
        salarioAjustado = salarioAtual * (1+porcentagemAumento);

        System.out.println("\n---------------------------");
        System.out.printf("O novo salario é de R$%.2f %n", (salarioAjustado));
        System.out.println("---------------------------");
        entrada.close();
    }
}