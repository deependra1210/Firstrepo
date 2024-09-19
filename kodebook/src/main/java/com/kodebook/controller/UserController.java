package com.kodebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodebook.entities.User;
import com.kodebook.services.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	@PostMapping("/signUp")
	public String addUser(@ModelAttribute User user)
	{
	String email=user.getEmail();
	String username =user.getUsername();
	boolean status=service.isExist(username, email);
	if(status)
	{
		service.addUser(user);
	}
	return "index";
	}
	@PostMapping("/login")
	public String login(@RequestParam String username , @RequestParam String password)
	{
		if(service.validateUser(username, password))
		{
			return "/home";
		}
		else
		{
			return "/index";
		}
	}
	
}


