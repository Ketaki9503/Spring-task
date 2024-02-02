package edu.cjc.main.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.main.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService hs;
	
	 
	
	@RequestMapping("/")
	public String prelogin() {
		
		return "login";
	}
	
	@RequestMapping("/guess")
	public String numbercheck(@RequestParam("guessNum")int gn,Model m) {
		
		String s=hs.numberchecks(gn);
		if(s.equals("Awesome You guess correct Number")) {
		m.addAttribute("msg", s);
		return "success";
		}else {
		m.addAttribute("msg", s);
		return "login";
		}
	}
	
	@RequestMapping("/guess1")
	public String preplayagain() {
		
			return "login";
		
	}
	
	
	
	
	
}
