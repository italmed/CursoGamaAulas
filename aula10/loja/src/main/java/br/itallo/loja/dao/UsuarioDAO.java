package br.itallo.loja.dao;

import org.springframework.data.repository.CrudRepository;

import br.itallo.loja.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
    public Usuario findByEmailAndSenha(String email, String senha); // basta escrever dois atributos - neste caso email e senha - separados por And
}