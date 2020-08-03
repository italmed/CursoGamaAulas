package aula03;

public class Sample05 {
    public static void main(String[] args) {
        int a;

        for(a=0; a < 10; a++){
            System.out.println(a);
        }

        // este for tem o mesmo efeito deste while abaixo:
        a=0;
        while(a < 10){
            System.out.println(a);
            a++;
        }
        System.out.print("\n\n");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }

        //exemplo de codigo com FOR:
        a = 10;
        for (int i=0; i<3; i++){
            a = a+i;
        }
        //convertendo para WHILE:

        a=10;
        int i=0;
        while(i<3){
            a = a+i;
            i++;
        }
    }
}