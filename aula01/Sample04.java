package aula01;

public class Sample04 {
    public static void main(String[] args) {
        
        //Conversão de tipos de dados
        int numeroInteiro;
        float numeroFloat;

        numeroInteiro = 230;
        numeroFloat = 7.99999f; //f para dizer que é float

        //casting: força uma conversão de tipo com possivel perda de precisão - não tem arredondamento
        //modo: (int)varivavelAqui
        numeroInteiro = (int)numeroFloat;

        System.out.println(numeroInteiro);
    }
}