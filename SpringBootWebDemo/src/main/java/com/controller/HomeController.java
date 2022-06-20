package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//serves the role of a controller
@RequestMapping(path="api")//send request to server
public class HomeController 
{
	@RequestMapping("/hello")
	@ResponseBody
	//response back to browser, it is responsible for changing string into html code
	public String hello() 
	{
		System.out.println("Welcome to Spring Web");
		return "Welcome to Spring Web";
	}

}

