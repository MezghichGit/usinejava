package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	@ResponseBody
	public String welcome()
	{
		return "<h2>Hello GK</h2>";
	}

	
	@RequestMapping("info")
	@ResponseBody
	public String info()
	{
		return "<h2>Mohamed Amine MEZGHICH</h2>";
	}
}
