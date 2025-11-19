package com.senai.backend.mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.mercado.models.Funcionario;
import com.senai.backend.mercado.services.FuncionarioService;

@RestController
@RequestMapping
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/cadastrar")
    public Funcionario cadastrar(@RequestBody Funcionario funcionario){
        return funcionarioService.cadastrar(funcionario);

    }
    
    @GetMapping("/recuperar-pelo-id/{id}")
    public Funcionario recuperarPeloId(@PathVariable Integer id){
        return funcionarioService.recuperarPorId(id);
    }

    @GetMapping("/listar-todos")
    public List<Funcionario> listarTodos(){
        return funcionarioService.listarTodos();
    }

     @PutMapping("/atualizar/{id}")
     public Funcionario atualizar(@PathVariable Integer id, @RequestBody Funcionario funcionario){
        return funcionarioService.listarTodos(id, funcionario);
     }

     @DeleteMapping("/deletar/{id}")
    public String removerPorId(@PathVariable Integer id){
        if (funcionarioService.removerPorId(id)) {
            return "Funcionario removido com sucesso";
        } 
            return "Falha em remover o funcionario";
        }
}
