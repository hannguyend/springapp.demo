package com.rental.springapp.helloworld.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.rental.springapp.helloworld.service.EmployeeManager;

public class EmployeeController implements Controller {

	protected final Log logger = LogFactory.getLog(getClass());

	private EmployeeManager employeeManager;

	public EmployeeManager getEmployeeManager() {
		return employeeManager;
	}

	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.info("in Employee Controller");
		ModelAndView mv = new ModelAndView("employeeList");
		mv.addObject("employeeList", this.employeeManager.getEmployeeList());
		return mv;
	}

}
