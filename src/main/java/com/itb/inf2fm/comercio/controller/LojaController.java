package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")

public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos() {
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 15l");
		p1.setDescricao("Produto Linha Branca com painel digital");
		p1.setCodigoBarras("TV4785667GHTN778");
		p1.setPreco(3215.89);
		
		Produto p2 = new Produto();
		p2.setId(20l);
		p2.setNome("Televisor 70'");
		p2.setDescricao("56FUH64378FFG9");
		p2.setCodigoBarras("Televisor Tela Plana led Samsung");
		p2.setPreco(6326.12);
		
		//Adicionando os produtos à lista
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		return "produtos";
	
	}

}
