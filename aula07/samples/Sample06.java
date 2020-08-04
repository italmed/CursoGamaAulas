//Array Lists

package samples;

import java.util.ArrayList;

public class Sample06 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("");

        // outro exemplo igual abaixo
        for (Integer numero : lista) {
            System.out.println(numero);
        }

        // para remover algum eleento da lista:
        System.out.println("");

        lista.remove(1); // remove quem está na posição 1 da lista
        for (Integer numero : lista) {
            System.out.println(numero);

        }

        // paraa dicionar alguem, utilizar .add(index, valor),
        // contudo o indice existent não será excluido, sera "empurrado" pra frente.

        lista.add(1, 5); // adicionara o numero 5 na posição 1, empurrando quem estiver na posilçao 1
                         // para a posição 2 e assim por diante.
        System.out.println("");
        for (Integer numero : lista) {
            System.out.println(numero);

        }

        // alterado um valor específico da lista
        System.out.println("");

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == 5) {
                System.out.println("Achei o numero 5, agora ele somará 1.");
                lista.set(i, lista.get(i) + 1);
            }

        }
        for (Integer numero : lista) {
            System.out.println(numero);

        }
    }
}
