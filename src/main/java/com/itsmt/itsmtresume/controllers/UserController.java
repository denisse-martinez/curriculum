package com.itsmt.itsmtresume.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itsmt.itsmtresume.models.User;
import com.itsmt.itsmtresume.repository.UserRepository;

@Controller
@RequestMapping(path = "/resume")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/agregar")
    public String agregarUsuario(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "resume/agregar_usuario";
    }
}
