/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: ClienteController.java
Explicação: classes agrupam dados e comportamentos; controladores coordenam requisições e regras.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package controller;

import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.ClienteRepository;

import java.util.Optional;

@RestController
@RequestMapping(value="/apiCliente")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepo;

    @GetMapping("/buscarCliente/{cpf}")
    public Optional<Cliente> buscarPorCPF(@PathVariable(value="cpf") int cpf) {
        return clienteRepo.findById(cpf);
    }

    @PostMapping("/inserirCliente")
    public void inserirClientes(@RequestBody Cliente cliente) {
        clienteRepo.save(cliente);
    }
}
