package com.senai.backend.mercado.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "A verdadeira Mercadoria são os amigos que fazemos pelo caminho",
        version = "1.0",
        description = "João Pedro de Souza Rodrigues."
    )
)
public class Swagger {

}