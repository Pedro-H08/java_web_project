package com.recuperacao_pw3.recuperacao_pw3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recuperacao_pw3.recuperacao_pw3.entities.Produto;
import com.recuperacao_pw3.recuperacao_pw3.repositories.ProdutoRepository;

@Service
public class ProdutosServices {
	@Autowired
	private ProdutoRepository produtoRepository; 
	
	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
	
	public void saves(Produto produto) {
		produtoRepository.save(produto);
	}

}
