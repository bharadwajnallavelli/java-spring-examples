package com.bharadwaj.spring.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bharadwaj.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	@RequestMapping("/displaylist")
	public ModelAndView displayObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displaylist");
		Employee employee = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		 employee.setId(234);
		 employee.setName("Gola");
		 employee.setSalary(45698);

		 employee2.setId(23446);
		 employee2.setName("Bola");
		 employee2.setSalary(356);

		 employee3.setId(994);
		 employee3.setName("Simha");
		 employee3.setSalary(45698);

		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		modelAndView.addObject("employees", employees);
		return modelAndView;

	}
}
