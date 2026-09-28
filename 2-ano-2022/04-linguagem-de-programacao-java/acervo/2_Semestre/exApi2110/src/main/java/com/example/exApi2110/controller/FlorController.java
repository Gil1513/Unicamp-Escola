/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: FlorController.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos; controladores coordenam requisições e regras.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package com.example.exApi2110.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exApi2110.model.Flor;
import com.example.exApi2110.repository.FlorRepository;
import java.util.List;

@RestController
@RequestMapping(value = "/apiFlorFloricultura")
public class FlorController {

    @Autowired
    FlorRepository florRep;

    @GetMapping(value = "/buscarFlor")
    public List<Flor> buscarFlores() {
        return florRep.findAll();
    }

    @PostMapping("/cadastrarFlor")
    public void cadastrarFlor(@RequestBody Flor flor) {
        florRep.save(flor);
    }
}