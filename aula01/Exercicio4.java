// leia um salário e aplique aumento de 25%

package aula01;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        float salarioMinimo;
        float kwh;
        float desconto = 0.85f;
        float valorConta;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o valor atual do salário mínimo");
        salarioMinimo = entrada.nextFloat();

        System.out.println("Qual a quantidade de kWh consumida?");
        kwh = entrada.nextFloat();
        
        System.out.println("\n---------------------------");
        System.out.printf("Cada kWh custa R$%.2f %n", (salarioMinimo/500));

        valorConta = (float)(salarioMinimo/500 * kwh);
        System.out.printf("A residência pagará o valor de R$%.2f %n", (valorConta));
        System.out.println("Com desconto de 15%, o valor é de R$" + (valorConta * desconto));
        System.out.println("---------------------------");
        entrada.close();
    }
}