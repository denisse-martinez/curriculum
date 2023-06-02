package com.itsmt.itsmtresume.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itsmt.itsmtresume.models.Command;
import com.itsmt.itsmtresume.models.School;
import com.itsmt.itsmtresume.models.SchoolExperience;
import com.itsmt.itsmtresume.models.Skills;
import com.itsmt.itsmtresume.models.User;
import com.itsmt.itsmtresume.models.WorkExperience;

@Controller
public class ResumeController {
	
	@RequestMapping(value = "/resume")
	public String mostrarFormulario(Model model) {
	  Command command = new Command();
	  command.setUser(new User());
	  command.setSchool(new School());
	  command.setSkills(new Skills());
	  command.setWorkExperience(new WorkExperience());
	  command.setSchoolExperience(new SchoolExperience());
	  model.addAttribute("command", command);
	  return "Index_2.html";
	}
	
	/*
	@RequestMapping(value = "/resume")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("Index_2");
        User user = new User();
        School school = new School();
        SchoolExperience schoolExperience = new SchoolExperience();
        Skills skills = new Skills();
        WorkExperience workExperience = new WorkExperience();
        
        mav.addObject("user", user);
        mav.addObject("school", school);
        mav.addObject("schoolExperience", schoolExperience);
        mav.addObject("skills", skills);
        mav.addObject("workExperience", workExperience);
        return mav;
    }*/
	
	/* Este metodo funciona con el mapeo /agregar del controlador userController para devolver la vista del formulario
    @RequestMapping(value = "/resume")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("Index_2");
        User user = new User();

        mav.addObject("user", user);

        return mav;
    }*/
}
