package com.itsmt.itsmtresume.controllers;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



//import com.itsmt.itsmtresume.repository.UsuarioRepository;

@Controller
public class WebController {
	
	//@Autowired
	//private UsuarioRepository UsuarioRepository;

    @RequestMapping(value = "/")
    public String index(Model model) {
        //	model.addAttribute("users", UsuarioRepository.findAll());
        return "index";
    }
}
