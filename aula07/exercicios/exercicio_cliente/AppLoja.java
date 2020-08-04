package exercicios.exercicio_cliente;

public class AppLoja {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carlos", "carlos@asas.com");
        ClienteVip c2 = new ClienteVip("Milton", "Milton@asas.com", 1000);

        c1.colocarCredito(100);

        if(c1.fazerCompra(50)){
            System.out.println("Compra aprovada. Saldo: " + c1.getCredito());
        } else{
            System.out.println("Compra NÃO aprovada. Saldo: " + c1.getCredito());
        }

        c2.colocarCredito(100);

        if(c2.fazerCompra(1000)){
            System.out.println("Compra aprovada. Saldo: " + c2.getCredito());
        }
        else{
            System.out.println("Compra NÃO aprovada. Saldo: " + c2.getCredito());
        }
        System.out.println(c1);
        System.out.println(c2);
    }
}