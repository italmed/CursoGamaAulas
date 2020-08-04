// este exemplo pede para que seja lida uma frase qualquer e escrita ela ao contrario:
//Exemplo: bom dia
//saída: aid mob

package exercicios;
import java.util.Stack;

public class Exercicio01 {
    public static void main(String[] args) {
        Stack<Character> pilha  = new Stack<>();
        String frase = "Exercicio facil";
        
        for (int i = 0; i < frase.length(); i++){
            pilha.push(frase.charAt(i));
        }
        
        for (int i = 0; i < frase.length(); i++){
            System.out.print(pilha.pop());
        }


        // outra forma de fazer com vetor:
        System.out.println("\n\noutra forma de fazer com vetor");
        char fraseVetor[] = frase.toCharArray();

        for (int i = 0; i < fraseVetor.length; i++){
            pilha.push(fraseVetor[i]);
        }
        
        for (int i = 0; i < frase.length(); i++){
            System.out.print(pilha.pop());

        }

        // outra forma de fazer com FOR IT, correponde ao for A in Lista, do python.
        System.out.println("\n\noutra forma de fazer com FOR IT");
        for (char c : fraseVetor){
            pilha.push(c);
        }

        for (char c : fraseVetor){
            System.out.print(pilha.pop());
        }
    }
}