package com.senai.backend.mercado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.senai.backend.mercado.models.Mercadoria;
import com.senai.backend.mercado.services.MercadoriaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class MercadoriaController {
    
    @Autowired
    private MercadoriaService mercadoriaService;

    @PostMapping("/cadastrar")
    public Mercadoria cadastrar(@RequestBody Mercadoria mercadoria){
        return mercadoriaService.cadastrar(mercadoria);

    }
    
    @GetMapping("/recuperar-por-id/{id}")
    public Mercadoria recuperarPorId(@PathVariable Integer id){
        return mercadoriaService.recuperarPorId(id);
    }
}
