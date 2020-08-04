package exercicios.exercicio_cliente;

public class Cliente {
    private String nome, email;
    private float credito, valor, novoCredito;

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
        credito = 0;
    }

    @Override
    public String toString() {
        return nome + " - " + email + " - Credito: R$" + credito;
    }

    public boolean fazerCompra(float valor){
         if (valor > 0){   
            if (valor > credito){
                return false;
            }
            else {
                credito -= valor;
                return true;
            }
        }
        return false;
    }

    public float getCredito(){
        return credito;
    }
    protected void setCredito(float credito){
            this.credito = credito;
    }

    public boolean colocarCredito(float novoCredito){
        if (novoCredito > 0){
            credito += novoCredito;
            return true;
        } 
        return false;
    }



}