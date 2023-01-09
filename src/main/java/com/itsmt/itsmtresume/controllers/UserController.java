package com.itsmt.itsmtresume.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itsmt.itsmtresume.models.User;
import com.itsmt.itsmtresume.repository.UserRepository;

@Controller
@RequestMapping(path = "/resume")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping(value = "/agregar")
    public ModelAndView agregarUsuario(@ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        System.out.println(user.toString());
        userRepository.save(user);
        ModelAndView mav = new ModelAndView("index_2");
        return mav;
    }
}
