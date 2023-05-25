package com.itsmt.itsmtresume.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.itsmt.itsmtresume.repository.UsuarioRepository;

@Controller
public class WebController {

    @GetMapping(value = "/")
    public String index(Model model) {
        return "index.html";
    }
}
