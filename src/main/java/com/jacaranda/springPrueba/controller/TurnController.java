package com.jacaranda.springPrueba.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jacaranda.springPrueba.model.Jacarandenno;
import com.jacaranda.springPrueba.service.JacarandennoService;
import com.jacaranda.springPrueba.service.SignatureService;
import com.jacaranda.springPrueba.service.TurnService;

@Controller
public class TurnController {
	
	@Autowired
	TurnService turnService;
	JacarandennoService jacarandennoS;

	// Muestra sólo los turnos que no se han completado.
	
	@GetMapping({"toDo"})
	public String todo(Model model) {	
		model.addAttribute("list",turnService.getTurnsToDo());
		return "index";
	}
	
	

}
