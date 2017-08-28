package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/wishes")
	public String sayHello(Model model){
		
		model.addAttribute("greeting", "How are you Gayathri!");
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/invitation")	
	public String invite(){
		return "welcome";
	}

}
