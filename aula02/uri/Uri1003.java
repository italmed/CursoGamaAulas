package aula02.uri;

import java.util.Scanner;

public class Uri1003 {
    
    public static void main(String[] args) {
        
        int a, b, soma;
        Scanner entrada = new Scanner(System.in);

        a = entrada.nextInt();
        b = entrada.nextInt();

        soma = a + b;

        System.out.printf("SOMA = %s %n", soma);
        
        entrada.close();
    }
}