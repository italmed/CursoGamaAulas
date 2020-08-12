package br.itallo.loja.dao;

import org.springframework.data.repository.CrudRepository;

import br.itallo.loja.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer>{
    
}