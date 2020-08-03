package aula01;

import java.util.Scanner;

public class Sample07 {
    public static void main(String[] args) {
        
        // entrada de dados

        Scanner entrada = new Scanner(System.in);
        
        String entradaDigitada;
        
        String nome;
        int idade;
        float peso;

        System.out.println("Digite sua idade: ");
        entradaDigitada = entrada.nextLine(); // leitura em formato texto
        idade = Integer.parseInt(entradaDigitada); // converte o texto lido para numero inteiro


        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();



        System.out.println("Digite seu peso: ");
        entradaDigitada = entrada.nextLine();
        peso = Float.parseFloat(entradaDigitada);

        System.out.println("Olá, " + nome + "!");
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Seu peso é: " + peso + " kg");

        entrada.close();

    }
}