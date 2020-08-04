package exercicios.exercicio_cliente;

public class Dependente {
    private String nome, email;

    public Dependente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public Dependente(){
        this.nome = "";
        this.email = "";
    }

    @Override
    public String toString() {
        return "Dependente: " + nome + " - " + email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.nome = email;
        
    
 
    }
}