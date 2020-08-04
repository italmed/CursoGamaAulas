package exercicios.exercicio_cliente;

public class Cliente {
    private String nome, email;
    private float credito;
    private Dependente dependente;

    public Cliente(String nome, String email, String nomeDependente, String emailDependente){
        this.nome = nome;
        this.email = email;
        credito = 0;
        this.dependente = new Dependente(nomeDependente, emailDependente);
    }

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
        credito = 0;
        this.dependente = new Dependente("", "");
    }

    @Override
    public String toString() {
        return nome + " - " + email + " - Credito: R$" + credito + "\n" + dependente;
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

    public String getDependente(){
        return dependente+"";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}