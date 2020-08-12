package br.itallo.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.itallo.loja.dao.PedidoDAO;
import br.itallo.loja.model.Pedido;

@RestController
@CrossOrigin("*")
public class PedidoController {

    @Autowired
    private PedidoDAO pedidoDao;

    @GetMapping("/pedido/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable int id){
        Pedido pedido = pedidoDao.findById(id).orElse(null);
        if(pedido != null){
            return ResponseEntity.ok(pedido);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}