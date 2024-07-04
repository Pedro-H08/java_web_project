package com.recuperacao_pw3.recuperacao_pw3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recuperacao_pw3.recuperacao_pw3.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}