package com.itsmt.itsmtresume.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itsmt.itsmtresume.models.Account;
import com.itsmt.itsmtresume.repository.AccountRpository;
/* 
@Controller
@RequestMapping(path = "/resume")
public class AccountController {
    
    @Autowired
    private AccountRpository accountRepository;

    @RequestMapping(value = "/resume")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("registrarvista");
	
        return mav;
    }


    @PostMapping(value = "/agregarcuenta")
    public ModelAndView agregarCuentaAndView(@ModelAttribute("account") Account account, BindingResult bindingResult, Model model) {
        System.out.println(account.toString());
        accountRepository.save(account);
        ModelAndView mav = new ModelAndView("Index_2");
        return mav;
    }

}*/
