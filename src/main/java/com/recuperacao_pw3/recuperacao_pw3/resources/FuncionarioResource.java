package com.recuperacao_pw3.recuperacao_pw3.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recuperacao_pw3.recuperacao_pw3.entities.Funcionario_user;

@RestController
@RequestMapping(value = "/users")
public class FuncionarioResource {
	
	@GetMapping
	public ResponseEntity<Funcionario_user> findAll(){
		Funcionario_user pedro = new Funcionario_user(1L, "pedro", "pedro@gmail.com", "1234");
		return ResponseEntity.ok().body(pedro);
	}
	

}
