//Aprendendo sobre Arvores com numeros inteiros.

package samples;

import java.util.TreeSet;

public class Sample04 {
    public static void main(String[] args) {
        
        String palavras[] = {"Carlos", "Moises", "Zeca", "Daniel", "Eleonor", "Alemão", "Talita", "Fenomemo"};
        TreeSet<String> tree = new TreeSet<>();

        for (String nome : palavras) { //para cada nome do vetor palavras,
            tree.add(nome); //adiciona o nome na arvore
        }

        for (String nome : tree) { //para cada nome da arvore,
            System.out.println(nome);; //imprime ele. A saída deve ser em ordem alfabetica
        }

    }
}