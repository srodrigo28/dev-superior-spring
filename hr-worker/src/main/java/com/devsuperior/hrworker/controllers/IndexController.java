package com.devsuperior.hrworker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/produto")
	public ModelAndView getIndex() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
