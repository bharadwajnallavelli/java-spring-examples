package com.bharadwaj.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bharadwaj.spring.springmvc.dto.User;

@Controller
public class UserController {

	@RequestMapping("userregistration")
	public ModelAndView showRegistration() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("User-reg");
		return modelAndView;
	}

	@RequestMapping(value="registerUser", method= RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("reg-result");
		return modelAndView;
	}
}
