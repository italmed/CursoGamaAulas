
// Neste problema, deve-se ler o código de uma peça 1, 
// o número de peças 1, o valor unitário de cada peça 1, 
// o código de uma peça 2, o número de peças 2 e o valor 
// unitário de cada peça 2. Após, calcule e mostre o valor a 
// ser pago.
//12 1 5.30
package aula02.uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        //declara o scanner
        Scanner entrada = new Scanner(System.in);
        //declara uma linha para receber os dados
        String linha;

        //faz a leitura desta linha e separa os dados pelo espaço em uma lista
        linha = entrada.nextLine();
        String array[]= linha.split(" ");

        
        float valor1 = Float.parseFloat(array[1]) * Float.parseFloat(array[2]);

        linha = entrada.nextLine();
        String array2[]= linha.split(" ");

        float valor2 = Float.parseFloat(array2[1]) * Float.parseFloat(array2[2]);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (valor1+valor2));
        entrada.close();
    }
}