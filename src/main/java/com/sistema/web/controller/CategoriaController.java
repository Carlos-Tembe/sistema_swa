package com.sistema.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.model.Categoria;
import com.sistema.service.CategoriaService;

@Controller
@RequestMapping("categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService service;

	@GetMapping("/")
	public String ola() {
		return "/categoria/ola";
	}

	@GetMapping("/cadastro")
	public String cadastrar(Categoria categoria) {
		return "/categoria/cadastro";
	}

	@PostMapping("/guardar")
	public String guardar(Categoria categoria) {
		service.salvar(categoria);
		return "redirect:/categorias/cadastro";
	}
}
