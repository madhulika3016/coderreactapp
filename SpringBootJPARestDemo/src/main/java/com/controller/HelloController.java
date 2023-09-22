package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api")
public class HelloController {
	
	@RequestMapping(path="/welcome")
	@ResponseBody
	public String hello()
	{
		String msg="welcome to Spring web";
		return msg;
	}
	//localhost:8080/api/welcome
	
	
	

}
