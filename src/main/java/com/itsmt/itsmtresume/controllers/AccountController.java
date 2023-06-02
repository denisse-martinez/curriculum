package com.itsmt.itsmtresume.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

	@RequestMapping(value = "/registroform")
	public String registrologin(Model model) {
		return "registrarvista.html";
	}

	/*
	 * @GetMapping(value = "/registroform")
	 * public String mostrarFormularioRegistro(Model model) {
	 * model.addAttribute("cuenta", new Account());
	 * return "registrarvista.html";
	 * }
	 */

}
