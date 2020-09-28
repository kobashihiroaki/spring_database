package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sample2Controller {
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("sample2");
		return mav;
	}
}
