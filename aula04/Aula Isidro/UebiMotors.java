public class UebiMotors {
    public static void main(String[] args) {
        
        //criei uma variável do tipo "Carro"
        
        Carro c, c2;
        c = new Carro(); // agora temos um objeto c do tipo Carro
        c2 = new Carro();

        // vamos preencher?

        c.marca = "Fiat";
        c.modelo = "Palio";
        c.ano = 2001;
        c.km = 158000;
        c.cor = "Branco";
        c.combustivel = "Gasolina";
        c.preco = 7000;

        c2.marca = "Ford";
        c2.modelo = "Fiesta";
        c2.ano = 2012;
        c2.km = 77000;
        c2.cor = "Preto";
        c2.combustivel = "Flex";
        c2.preco = 30000;

        System.out.println("Carro = "+c.marca+"/"+c.modelo);
        System.out.println("Preço = "+c.preco);
        double imposto1 = c.calcularIPVA();
        System.out.println("IPVA = "+imposto1);

        System.out.println("");
        System.out.println("Carro = "+c2.marca+"/"+c2.modelo);
        System.out.println("Preço = "+c2.preco);
        double imposto2 = c2.calcularIPVA();
        System.out.println("IPVA = "+imposto2);

    }
}