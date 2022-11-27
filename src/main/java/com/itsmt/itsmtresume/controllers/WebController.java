package com.itsmt.itsmtresume.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itsmt.itsmtresume.models.Usuario;
import com.itsmt.itsmtresume.repository.UserRepository;

@Controller
public class WebController {
	
	@Autowired
	private UserRepository userRepository;

    @RequestMapping(value = "/")
    public String index(Model model) {
    	
    	model.addAttribute("users", userRepository.findAll());
    	
        return "index";
    }
}
