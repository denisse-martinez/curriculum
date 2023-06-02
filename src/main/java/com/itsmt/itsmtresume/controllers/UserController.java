package com.itsmt.itsmtresume.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itsmt.itsmtresume.models.Command;
import com.itsmt.itsmtresume.models.School;
import com.itsmt.itsmtresume.models.SchoolExperience;
import com.itsmt.itsmtresume.models.Skills;
import com.itsmt.itsmtresume.models.User;
import com.itsmt.itsmtresume.models.WorkExperience;


@Controller
@RequestMapping(path = "/resume")
public class UserController {
	

	@PostMapping(value = "/agregar")
    public String agregarUsuario(@ModelAttribute("command") Command command, BindingResult bindingResult, Model model) {
        System.out.println(command.toString());
        User user = command.getUser();
        School school = command.getSchool();
        Skills skills = command.getSkills();
        WorkExperience workExperience = command.getWorkExperience();
        SchoolExperience schoolExperience = command.getSchoolExperience();
        model.addAttribute("command", command);
        return "redirect:/resume";
    }

	/*
	private final UserRepository userRepository;
	private final SchoolExperienceRepository schoolExprienceRepository;
	private final SkillsRepository skillsRepository;
	private final SchoolRepository schoolRepository;
	private final WorkExperienceRepository workExperienceRepository;
	
	public UserController(UserRepository userRepository, SchoolExperienceRepository schoolExprienceRepository,
			SkillsRepository skillsRepository, SchoolRepository schoolRepository,
			WorkExperienceRepository workExperienceRepository) {
		super();
		this.userRepository = userRepository;
		this.schoolExprienceRepository = schoolExprienceRepository;
		this.skillsRepository = skillsRepository;
		this.schoolRepository = schoolRepository;
		this.workExperienceRepository = workExperienceRepository;
	}*/
	
	
	/*@PostMapping("/registro")
    public ModelAndView registrarDatos(@ModelAttribute("command") Command command,BindingResult bindingResult, Model model) {
		userRepository.save(user);
		schoolExperience.setUser(user);
		schoolExprienceRepository.save(schoolExperience);
		skills.setUser(user);
		skillsRepository.save(skills);
		
		school.setUsers(Arrays.asList(user));
		schoolRepository.save(school);
		workExperience.setUser(user);
		workExperienceRepository.save(workExperience);
		ModelAndView mavr = new ModelAndView("Index_2");
        return mavr;
    }*/
/*
    @Autowired
    private UserRepository userRepository;
    

    @PostMapping(value = "/agregar")
    public ModelAndView agregarUsuario(@ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        System.out.println(user.toString());
        userRepository.save(user);
        ModelAndView mav = new ModelAndView("index_2");
        return mav;
    }*/
	
}
