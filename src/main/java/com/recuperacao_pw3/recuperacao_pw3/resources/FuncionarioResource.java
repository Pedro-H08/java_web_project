package com.recuperacao_pw3.recuperacao_pw3.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.recuperacao_pw3.recuperacao_pw3.entities.Funcionario_user;
import com.recuperacao_pw3.recuperacao_pw3.entities.Produto;
import com.recuperacao_pw3.recuperacao_pw3.services.FuncionarioServices;
import com.recuperacao_pw3.recuperacao_pw3.services.ProdutosServices;

@Controller
public class FuncionarioResource {
	
    @Autowired
    private FuncionarioServices funcionarioService;
	
    @GetMapping("/conclusao")
    public String findAll(Model model) {
        return "conclusao";
    }
	
    @GetMapping("/")
    public String cadastroFuncPage(Model model) {
        model.addAttribute("funcionario", new Funcionario_user());
        return "cadastroFunc";
    }
    @GetMapping("/cadastro")
    public String cadastroFuncpagina(Model model) {
        model.addAttribute("funcionario", new Funcionario_user());
        return "cadastroFunc";
    }

    @PostMapping("/save")
    public String salvarFuncionario(@ModelAttribute("funcionario") Funcionario_user funcionario) {
        funcionarioService.save(funcionario);
        return "redirect:cadastroProduto";
    }
    
    @Autowired
    private ProdutosServices produtoService;
	
    @GetMapping("/cadastroProduto")
    public String cadastroProduto(Model model) {
        model.addAttribute("produto", new Produto());
        return "cadastroProduto";
    }
    
    @PostMapping("/saves")
    public String salvarProduto(@ModelAttribute("produto") Produto produto) {
        produtoService.saves(produto);
        return "redirect:conclusao";
    }
}
