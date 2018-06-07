package com.bharadwaj.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bharadwaj.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	@RequestMapping("/displayobject")
	public ModelAndView displayObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayobject");
		Employee employee = new Employee();
		employee.setId(234);
		employee.setName("Gola");
		employee.setSalary(25400);
		modelAndView.addObject(employee);
		return modelAndView;

	}
}
