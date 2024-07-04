package com.recuperacao_pw3.recuperacao_pw3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recuperacao_pw3.recuperacao_pw3.entities.Funcionario_user;
import com.recuperacao_pw3.recuperacao_pw3.repositories.FuncionarioRepository;

@Service
public class FuncionarioServices {
	@Autowired
	private FuncionarioRepository repository;
	
	public List<Funcionario_user> findAll(){
		return repository.findAll();
	}
	
	public void save(Funcionario_user funcionario) {
		repository.save(funcionario);
	}
	
	

}
