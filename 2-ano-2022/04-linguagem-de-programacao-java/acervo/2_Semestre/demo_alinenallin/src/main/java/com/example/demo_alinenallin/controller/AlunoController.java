/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: AlunoController.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos; controladores coordenam requisições e regras.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package com.example.demo_alinenallin.controller;

import com.example.demo_alinenallin.model.Aluno;
import com.example.demo_alinenallin.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value="/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alunorep;

    @GetMapping (value="/buscarAlunos")
    public List<Aluno> buscarTodos(){
        return alunorep.findAll();
    }
    /*
    @PostMapping ("/postAluno")
    public ResponseEntity<Aluno> inserirAluno(@RequestBody Aluno aluno) {
        return alunorep.save(aluno);
    }
    */
}
