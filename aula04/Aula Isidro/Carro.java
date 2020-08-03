//aqui começo a definição do tipo de dado CARRO
public class Carro {

    // aqui começam as propriedades ou atributos
    String  marca;
    String  modelo;
    int     ano;
    String  cor;
    String  combustivel;
    int     km;
    double  preco;

    // funcionalidades / comportamento / métodos
    double calcularIPVA(){
        double valorIPVA;

        if (ano < 2000){
            valorIPVA = 0;
        } 
        else {
            valorIPVA = preco * 0.04;   
        }
        return valorIPVA;
    }

}