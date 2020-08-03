package aula02.uri;
import java.io.IOException;
import java.util.Scanner; 

public class Uri1009 {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        double salario, vendas, comissao;
        
        nome = entrada.nextLine();
        salario = entrada.nextFloat();
        vendas = entrada.nextFloat();
        
        comissao = vendas * 0.15f;
        salario = salario + comissao;
        System.out.println(nome); //ESTE DEVE EXCLUIR PARA ENTRAR NO  URI
        System.out.printf("TOTAL = R$ %.2f", salario);
        entrada.close();
    }
 
}
