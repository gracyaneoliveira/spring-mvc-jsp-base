package com.produto.wine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VinhosController {

	@RequestMapping("/vinhos/novo")
	public String novo(){
		return "vinho/CadastroVinho";
	}
}
