package com.senai.backend.mercado.services;

import java.util.List;

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

    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }
    
    public Funcionario listarTodos(Integer id, Funcionario funcionario){
        Funcionario fun = funcionarioRepository.findById(id).get();
        if(funcionario != null){
        funcionario.setId(fun.getId());
        return funcionarioRepository.save(funcionario);
        }
        return null;
    }

    public boolean removerPorId(Integer id){
      Funcionario fun = funcionarioRepository.findById(id).get();
      if(fun != null){
        funcionarioRepository.deleteById(id);
        return true;
      }  
        return false;
    }
}
