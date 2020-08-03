package exercicios;

public class Ebook {
   
    String titulo, autor;
    int paginas, paginaAtual;

    public Ebook(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.paginaAtual = 0;
    }


    //metodos:
    public void avancarPagina(){
        if (paginaAtual == paginas){
            
        } else {
            paginaAtual++;
        }
    }

    public void retrocederPagina(){
        if (paginaAtual == 0){
            
        } else {
            paginaAtual--;
        }
    }

    public void irParaPag(int irPara){
        paginaAtual = irPara;
    }

    public void exibirPag(){
        System.out.printf("Você está exibindo o conteúdo da página %d\n", paginaAtual);
    }

    public void mostrarCapa(){
        paginaAtual = 0;
        System.out.printf("Você está exibindo a capa (pagina \"zero\")\nPágina atual: %d\n", paginaAtual);

    }


}