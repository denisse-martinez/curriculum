package com.itsmt.itsmtresume.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeController {
    
    @RequestMapping(value = "/resume")
    public String index() {
    	
    	return "Index_2";
    }
}
