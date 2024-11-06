package com.klef.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.klef.springboot.model.User;
import com.klef.springboot.service.Userservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class UserController {
	
	@Autowired
	private Userservice userservice;
	
	
	@GetMapping("/")
	public String renderindex() {
		return "index";
	}
	
	
	@GetMapping("/adduser")
	public String add() {
		return "adduserform";
	}
	
	@PostMapping("/adduserdata")
	public String postMethodName(@ModelAttribute User user,Model model) {
		//TODO: process POST request
		model.addAttribute("user", user);
		System.out.println(userservice.addEmp(user));//this will be printed in console
		
		return "viewdata";
	}
	
	@GetMapping("/viewall")
	public String getalldata(Model model) {//when we want to send any data to a page so we have to use Model class or else modelview class
		
		
		model.addAttribute("user", userservice.getall() );
		return "display" ;
	}
	
	
	
	
	
	
	

}
