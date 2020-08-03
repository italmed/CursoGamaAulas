package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        
        linha("_",20);
    }

    //METODO COM DOIS PRAMETROS E SEM RETORNO
    public static void linha(char simbolo, int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.print(simbolo);
        }
        System.out.println();
    }

}

