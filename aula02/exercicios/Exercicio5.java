package aula02.exercicios;

import java.util.Scanner;


/**
 * Exercicio5
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha = "R10p5";
        String senhaUsuario;

        System.out.println("Digite a senha para acesso:");
        senhaUsuario = entrada.nextLine();

        if (senhaUsuario.equals(senha)){
            System.out.println("Acesso Concedido.");
        }
        else {
            System.out.println("Acesso Bloqueado!");
        }
        entrada.close();
    }
}