// escreva um prgrama que leia duas notas de um aluno, 
// calcule e mostre a mpedia artmética do aluno

package aula01;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float media;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();
        
        media = (nota1+nota2)/2;

        System.out.println("A média das notas é: " + media);
        entrada.close();
    }
}