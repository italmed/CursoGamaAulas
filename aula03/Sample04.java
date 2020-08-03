package aula03;

public class Sample04 {
    public static void main(String[] args) {
        int cont = 1;
        int soma = 0;

        while (cont <= 10){
            System.out.println(soma);
            soma = soma + cont;
            cont ++;
        }

        System.err.println("A soma total é:" + soma);
    }
}