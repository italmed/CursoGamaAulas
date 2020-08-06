package br.itallo.empresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.itallo.empresa.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{
    
}