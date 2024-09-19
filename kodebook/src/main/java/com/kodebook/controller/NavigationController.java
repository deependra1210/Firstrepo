package com.kodebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@GetMapping("/openSignUp")
	public String openSugnUp()
	{
		return "signUp";
	}
	
	@GetMapping("/openCreatePost")
	public String openCreatePost()
	{
		return "CreatePost";
	}

}
