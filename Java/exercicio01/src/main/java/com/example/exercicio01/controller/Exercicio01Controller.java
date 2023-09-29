package com.example.exercicio01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class Exercicio01Controller {

	
	@GetMapping
	public String helloworld() {
		return "Hello world";
	}
	@GetMapping("/bsm")
	public String bsmGeneration() {
		return "LISTA DE BSMs Generation: \r\n"
				+"Persistência\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Orientação ao Futuro\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Trabalho em Equipe\r\n"
				+ "Comunicação\r\n"
				+ "Orientação aos Detalhes\r\n"
				+ "Proatividade";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "OBJETIVOS DE APRENDIZAGEM DESTA SEMANA: \n"
				+ "Melhorar minha orientação ao detalhe e obter proficiência nas linguagens aprendidas "
				+ "durante a semana do bootcamp Generation";
	}
}