package com.senai.backend.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.mercado.models.Mercadoria;

@Repository
public interface MercadoriaRepository extends JpaRepository<Mercadoria, Integer> {
    

}
