package exercicios.exercicio_cliente;

public class ClienteVip extends Cliente {

    private float creditoEspecial;

    public ClienteVip(String nome, String email, float creditoEspecial){
        super(nome, email);
        this.creditoEspecial = creditoEspecial;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - Credito especial: " + creditoEspecial;
    }

    @Override
    public boolean fazerCompra(float valor) {
        if (valor>0){
            if (valor > (getCredito()+creditoEspecial)){
                return false;
            }
            else {
                setCredito(getCredito() - valor);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean colocarCredito(float novoCredito) {
        // TODO Auto-generated method stub
        return super.colocarCredito(novoCredito);
    }

 
}