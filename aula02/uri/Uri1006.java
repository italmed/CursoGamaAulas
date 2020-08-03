package aula02.uri;
import java.util.Scanner;
//Leia 3 valores, no caso, variáveis A, B e C, 
//que são as três notas de um aluno. A seguir, calcule a média do aluno, 
//sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
//Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

public class Uri1006 {
    public static void main(String[] args) {
        double a, b, c, media;
        
        Scanner entrada = new Scanner(System.in);
        
        
        a = entrada.nextFloat() * 0.2;

        b = entrada.nextFloat() * 0.3;
        c = entrada.nextFloat() * 0.5;

        media = a+b+c;

        System.out.printf("MEDIA = %.1f%n", media);
        entrada.close();


    }
}