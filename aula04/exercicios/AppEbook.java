package exercicios;

import java.util.Scanner;

public class AppEbook {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Ebook livro = new Ebook("O lobo e o elefante", "Gilson Flores", 320);
        int funcao, paginaDesejada;

        funcao = 1;
        System.out.println("__________________________________________________________________\n");
        System.out.printf("Bem vindo ao Ebook Java. Você está acessando o livro %s.\n\n", livro.titulo);
        
        

        
        while(funcao !=0){
            System.out.println("\n\nO que deseja fazer? Digite o número correspondente:");
            System.out.println("1 - Avançar Página\n2 - Voltar uma página\n3 - Ir para uma página específica\n4 - Exibir conteúdo da página\n5 - Mostrar a Capa\n0 - Sair\n");
            funcao = entrada.nextInt();

            
            if(funcao == 1){
                livro.avancarPagina();
                System.out.printf("Pagina virada! Pagina atual: %d", livro.paginaAtual);
            }
            
            if(funcao == 2){
                livro.retrocederPagina();
                System.out.printf("Pagina voltada! Pagina atual: %d", livro.paginaAtual);
            }

            if(funcao == 3){
                System.out.println("Digite a página desejada: ");
                paginaDesejada = entrada.nextInt();
                if(paginaDesejada > livro.paginas){
                    System.out.println("Página não existe");
                } 
                else {
                livro.irParaPag(paginaDesejada);
                System.out.printf("Você avançou para a página: %d", livro.paginaAtual);
                }
            }

            if(funcao == 4){
                livro.exibirPag();

            }

            if(funcao == 5){
                livro.mostrarCapa();
            }
        }
        
        System.out.println("\n\nObrigado por utilizar o Ebook Java!\n");
        entrada.close();
    }
}