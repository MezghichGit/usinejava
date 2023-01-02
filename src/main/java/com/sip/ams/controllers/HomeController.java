package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	//@ResponseBody
	public String info(Model model)
	{
		String formation = "Devops";
		String date = "Janvier";
		int nbrCandidats = 12;
		String contenu[] = {"Git","Docker","Maven","Jenkins","SonarQube"};
		model.addAttribute("formation", formation);
		model.addAttribute("dateFormation", date);
		model.addAttribute("contenu", contenu);
		return "/home/info";
	}
}
