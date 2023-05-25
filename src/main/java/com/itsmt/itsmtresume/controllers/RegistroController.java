/*
 * package com.itsmt.itsmtresume.controllers;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.stereotype.Controller;
 * import org.springframework.ui.Model;
 * import org.springframework.validation.BindingResult;
 * import org.springframework.web.bind.annotation.ModelAttribute;
 * import org.springframework.web.bind.annotation.PostMapping;
 * import org.springframework.web.bind.annotation.RequestMapping;
 * import org.springframework.web.servlet.ModelAndView;
 * 
 * import com.itsmt.itsmtresume.models.Account;
 * import com.itsmt.itsmtresume.repository.AccountRpository;
 * 
 * @Controller
 * 
 * @RequestMapping(path = "/registroform")
 * public class RegistroController {
 * 
 * @Autowired
 * private AccountRpository accountRepository;
 * 
 * @PostMapping(value = "/registrar")
 * public ModelAndView agregarUsuario(@ModelAttribute("cuenta") Account cuenta,
 * BindingResult bindingResult,
 * Model model) {
 * System.out.println(cuenta.toString());
 * accountRepository.save(cuenta);
 * ModelAndView mvar = new ModelAndView("index_2");
 * return mvar;
 * }
 * }
 */
