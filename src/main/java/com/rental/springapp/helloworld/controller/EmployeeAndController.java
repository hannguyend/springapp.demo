package com.rental.springapp.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rental.springapp.helloworld.model.Employee;
import com.rental.springapp.helloworld.service.EmployeeManager;

@Controller
public class EmployeeAndController {
	
	@RequestMapping("/showEmployeeForm")
	public ModelAndView getEmployeeForm() {
		ModelAndView mv = new ModelAndView("employeeAdd");
		mv.addObject("employeeEntity", new Employee());
		return mv;
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee e) {
		ModelAndView mv = new ModelAndView("employeeList");
		
		EmployeeManager employeeManager = new EmployeeManager();
		
		if (e.getFirstName().isEmpty() || e.getLastName().isEmpty()){
			return mv.addObject("employeeList", employeeManager.getEmployeeList());
			
		}
		employeeManager.addEmployee(e);
		mv.addObject("employeeList", employeeManager.getEmployeeList());
		return mv;
	}
}