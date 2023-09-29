package com.example.blogpessoal.controller;

import com.example.blogpessoal.model.Postagens;
import com.example.blogpessoal.repository.PostagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController define que essa classe é a controladora do programa
//@RequestMapping define o endereço de acesso da classe
//@CrossOrigin permite que aplicações de fora acessem a minha aplicação e o * diz que permite todas
@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagensController {

    // PostagensRepository postagensRepository  Substitui o comando implements na interface,
    // me permitindo ter controle total e assim podendo escolher o que vou pegar da interface
    // @Autowired (Injeção de Dependência), é a implementação utilizada pelo Spring Framework
    // para aplicar a Inversão de Controle (IoC) quando for necessário. A Injeção de Dependência
    // define quais Classes serão instanciadas e em quais lugares serão Injetadas quando houver
    // necessidade.
    @Autowired
    private PostagensRepository postagensRepository;

    @GetMapping
    public ResponseEntity<List<Postagens>> getAll(){
        return ResponseEntity.ok(postagensRepository.findAll());
    }
}
