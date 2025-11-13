package com.senai.backend.mercado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.mercado.models.Funcionario;
import com.senai.backend.mercado.repositories.FuncionarioRepository;


@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario cadastrar(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

        public Funcionario recuperarPorId(Integer id){
        return funcionarioRepository.findById(id).get();
    }

    

}
