package com.fatec.pwcap03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");
	}
	@GetMapping("/login")
	public ModelAndView autenticacao() {
		return new ModelAndView ("paginaLogin");
	}

	//@RequestMapping(value = "/aluno/cadastrar", method = RequestMethod.GET)
	@GetMapping ("/aluno/cadastrar")
	public ModelAndView cadastrarAluno() {
		return new ModelAndView ("cadastrarAluno");
	}
	@GetMapping("/livro/cadastrar")
	public ModelAndView cadastrarLivro() {
		return new ModelAndView ("cadastrarLivro");
	}
}
