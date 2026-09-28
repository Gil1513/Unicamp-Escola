/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: CarroController.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos; controladores coordenam requisições e regras.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package controller;

import model.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.CarroRepository;

import java.util.List;

@RestController
@RequestMapping (value="/apiCarro")
public class CarroController {
    @Autowired
    CarroRepository carRepo;

    @GetMapping("/buscarCarro")
    public List<Carro> buscarCarros() {
        return carRepo.findAll();
    }

    @PostMapping("/inserirCarro")
    public void inserirCarros(@RequestBody Carro carro){
        carRepo.save(carro);
    }
}
