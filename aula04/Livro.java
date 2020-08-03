/**
 * Livro
 */
public class Livro {

    String titulo;
    String autor;
    String editora;
    int numeroPagina;
    boolean disponivel;

    // métodos desta classe

    //método construtor> inicializa os atributos do objeto
    //ele tem o mesmo nome da classe

    public Livro(String titulo, String autor, String editora, int numeroPagina){
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPagina = numeroPagina;
        this.editora = editora;
        this.disponivel = true;
    }

    public void emprestar(){
         disponivel = false;
     }
    
    //métodos para exibir os dados de um livro
    public void exibirDados(){
        System.out.printf("Título do livro: %s\nAutor: %s\nEditora: %s\n", titulo, autor, editora);
        System.out.printf("Número de paginas: %d\n\nFim\n\n", numeroPagina);
    }
    public void devolver(){
        disponivel = true;
    }

    public boolean estaDisponivel(){
        return disponivel;
    }



}