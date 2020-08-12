package br.itallo.loja.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity //pra dizer que este cara é uma entidade no BD // diz que ela será mapeada no banco de dados
@Table(name = "usuario") //diz o nome da tabela que será criada/utilizada no BD
public class Usuario {
    
    @Id //indica que este campo é chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // diz que o campo será auto gerado de um em um
    @Column(name = "id") //diz o nome da coluna na BD
    private int id;
    
    @Column(name = "nome", length = 100)    
    private String nome;
  
    @Column(name = "email", length= 100)
    private String email;
    
    @Column(name = "cpf", length = 20)
    private String cpf;
    
    @Column(name = "senha", length = 20)
    private String senha;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitante")
    @JsonIgnoreProperties("solicitante")
    private List<Pedido> pedidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    
    
}