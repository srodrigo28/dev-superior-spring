package br.com.book.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@GetMapping("/produtos")
	public ModelAndView Produtos() {
		ModelAndView mv = new ModelAndView("produto");
		return mv;
	}
}
