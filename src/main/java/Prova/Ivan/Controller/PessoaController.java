package com.ivan.universo.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Prova.Ivan.Model.*;

@Controller
public class PessoaController
{
	@RequestMapping("adicionaPessoa")
	
	public ModelAndView getEmployeeForm() {
		ModelAndView mv = new ModelAndView("Formulario");
		mv.addObject("adicionaPessoa", new Pessoa());
		return mv;
	}
	
	@RequestMapping("adicionaPessoa")
	public ModelAndView addemployee(@ModelAttribute Pessoa p) {
		ModelAndView mv = new ModelAndView("pessoaList");
		System.out.print(p.getNome());
		System.out.print(p.getGenero());
		System.out.print(p.getIdade());
		System.out.print(p.getServico());
		
		PessoaPeople pessoaPeople = new PessoaPeople();
		pessoaPeople.addPessoa(p);
		mv.addObject("pessoaList", pessoaPeople.getPessoaList());
		
		return "Confirmacao";
	}

}
