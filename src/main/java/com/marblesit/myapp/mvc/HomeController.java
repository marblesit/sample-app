package com.marblesit.myapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(ModelMap model) {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("name", "Cory");
		return mv;
	}
}
