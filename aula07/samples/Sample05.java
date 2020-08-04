// tabela de HASH para associações de CHAVE e VALOR

package samples;

import java.util.Hashtable;

public class Sample05 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hash = new Hashtable<>();

        hash.put(1, "Um");
        hash.put(2, "Dois");
        hash.put(3, "Três");
        hash.put(4, "Quatro");

        int num = 3;
        System.out.println(hash.get(num));

    }
}