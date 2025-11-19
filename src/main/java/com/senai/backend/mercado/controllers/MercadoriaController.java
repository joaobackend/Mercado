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

import com.senai.backend.mercado.models.Mercadoria;
import com.senai.backend.mercado.services.MercadoriaService;

@RestController
@RequestMapping("mercadoria")
public class MercadoriaController {
    
    @Autowired
    private MercadoriaService mercadoriaService;

    @PostMapping("/cadastro")
    public Mercadoria cadastro(@RequestBody Mercadoria mercadoria){
        return mercadoriaService.cadastrar(mercadoria);

    }
    
    @GetMapping("/recuperar-por-id/{id}")
    public Mercadoria recuperarPorId(@PathVariable Integer id){
        return mercadoriaService.recuperarPorId(id);
    }

    @GetMapping("/listar-todos")
    public List<Mercadoria> listarTodos(){
        return mercadoriaService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public Mercadoria atualizar(@PathVariable Integer id, @RequestBody Mercadoria mercadoria){
        return mercadoriaService.atualizar(id, mercadoria);
    }

    @DeleteMapping("/deletar/{id}")
    public String removerPorId(@PathVariable Integer id){
        if (mercadoriaService.removerPorId(id)) {
            return "Mercadoria removida com sucesso";
        } 
            return "Falha ao remover a mercadoria";
        }
    }

