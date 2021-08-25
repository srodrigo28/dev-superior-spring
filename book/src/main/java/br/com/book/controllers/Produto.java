package br.com.book.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Produto {
	
	@GetMapping("/produto")
	public ModelAndView getList() {
		ModelAndView mv = new ModelAndView("produto");
		return mv;
	}

}
