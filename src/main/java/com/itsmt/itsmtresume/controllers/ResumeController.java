package com.itsmt.itsmtresume.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itsmt.itsmtresume.models.User;

@Controller
public class ResumeController {
    
    @RequestMapping(value = "/resume")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("Index_2");
		User user = new User();
		
        mav.addObject("user", user);
		
        return mav;
    }
}
