//Aprendendo sobre Arvores.

package samples;

import java.util.TreeSet;

public class Sample03 {
    public static void main(String[] args) {
        
        int numeros[] = {2, 4, 1, 6, 3, 7, 9, 5};
        TreeSet<Integer> tree = new TreeSet<>();

        for (int numero : numeros) { //para cada numero do vetor numeros,
            tree.add(numero); //adiciona o numero na arvore
        }

        for (int numero : tree) { //para cada numero da arvore,
            System.out.println(numero);; //imprime ele. A saída deve ser em ordem crescente ou alfabetica
        }

    }
}