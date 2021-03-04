package com.fatec.pwcap03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView autenticacao() {
		return new ModelAndView ("paginaLogin");
	}

	@GetMapping("/aluno/cadastrar")
	public String cadastrarAluno() {
		return "/cadastrarAluno";
	}
	@GetMapping("/livro/cadastrar")
	public String cadastrarLivro() {
		return "/cadastrarLivro";
	}
}
