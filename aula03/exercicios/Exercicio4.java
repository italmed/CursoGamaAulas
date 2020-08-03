package aula03.exercicios;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, contagemPar, contagemImpar, cont;
        contagemImpar = 0;
        contagemPar = 0;
        cont = 1;

        while (cont <=10){
            System.out.printf("Digite o número #%d: ", cont);
            num = entrada.nextInt();
            if (num%2 == 0){
                contagemPar++;
            } else {
                contagemImpar++;
            }
            cont++;
        }
        System.out.printf("\nForam inseridos:\n ~ %d números pares\n ~ %d números ímpares.\n", contagemPar, contagemImpar);
        
        entrada.close();
    }
}