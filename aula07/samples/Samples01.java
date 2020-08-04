// utilizando pilhas > stack

package samples;

import java.util.Stack;

/**
 * Samples01
 */
public class Samples01 {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

    //     pop = desemplilhar (tirar da pilha)
    //     push = emplilhar (colocar na pilha)
    //     peek = ver quem está no Topo 
    //     empty = ver se está vazia
    //     add = adicionar um valor em um determinado index da pilha, diferentemente do push
    
    for  (int i = 0; i < 10; i++){
        pilha.push(i);
    }

    while(!pilha.isEmpty()){
        System.out.println(pilha.pop());
    }

}


}