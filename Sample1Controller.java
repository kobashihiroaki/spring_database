package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sample1Controller {
	@RequestMapping("/sample1")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("sample1");
		return mav;
	}
	@RequestMapping("/other")
	public String other() {
		return "redirect:/sample1";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "forward:/sample1";
	}
}
