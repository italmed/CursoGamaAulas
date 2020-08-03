package aula03.uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float a, b, c, d;
        boolean cond1, cond2, cond3, cond4, cond5;
        //LER A, B C D
        String linha[] = entrada.nextLine().split(" ");
        
        a = Float.parseFloat(linha[0]);
        b = Float.parseFloat(linha[1]);
        c = Float.parseFloat(linha[2]);
        d = Float.parseFloat(linha[3]);


        cond1 = b > c;
        cond2 = d > a;
        cond3 = c+d > a+b;
        cond4 = c>=0 && d>=0;
        cond5 = (a%2 == 0);


        if (cond1 && cond2 && cond3 && cond4 && cond5) {
            System.out.println("Valores aceitos");
        } else{
            System.out.println("Valores nao aceitos");
        }

        entrada.close();

    }
}