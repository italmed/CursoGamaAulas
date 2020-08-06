package br.itallo.firstspring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//criação de rotas
@RestController
@RequestMapping("/exemplo")
public class Controller {
    
    @RequestMapping("/hello")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("Hello World!");
    }

    
}