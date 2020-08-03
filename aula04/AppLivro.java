
public class AppLivro {
    public static void main(String[] args) {
        
        Livro l1 = new Livro("Titulo teste", "Zé autor", "Editora mágica", 444);

        l1.exibirDados();
        
        l1.emprestar();

        if(l1.estaDisponivel()){
            System.out.println("O livro " + l1.titulo + " está disponível");
        } 
        else {
            System.out.println("O livro " + l1.titulo + " NÃO está disponível");
        }

        Livro l2 = new Livro("Titulo segundo", "Zé autor", "Editora mágica", 444);

        l1.devolver();

        if(l2.estaDisponivel()){
            System.out.println("O livro " + l2.titulo + " está disponível");
        } 
        else {
            System.out.println("O livro " + l2.titulo + " NÃO está disponível");
        }


    }
}