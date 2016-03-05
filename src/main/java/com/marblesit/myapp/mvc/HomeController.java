package com.marblesit.myapp.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marblesit.myapp.entity.Member;
import com.marblesit.myapp.service.SampleService;

@Controller
public class HomeController {

	@Autowired
	private SampleService service;

	public static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("home")
	public ModelAndView home(ModelMap model) {
		Member member = service.getMember(1);
		
		ModelAndView mv = new ModelAndView("home");
		/*
		 * This line will get a org.hibernate.LazyInitializationException
		 */
//		mv.addObject("name", member.getName() + " phone: " + member.getPhoneNumbers());

		mv.addObject("name", member.getName());

		return mv;
	}
}
