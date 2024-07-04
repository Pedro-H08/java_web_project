package com.recuperacao_pw3.recuperacao_pw3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.recuperacao_pw3.recuperacao_pw3.repositories.FuncionarioRepository;
import com.recuperacao_pw3.recuperacao_pw3.repositories.ProdutoRepository;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
}
