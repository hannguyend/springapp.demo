package com.rental.springapp.helloworld.service;

import java.util.ArrayList;
import java.util.List;
import com.rental.springapp.helloworld.model.Employee;

public class EmployeeManager {
	private static List<Employee> employeeList;

	public EmployeeManager() {
		employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("1", "Mike", "Smith"));
		employeeList.add(new Employee("2", "John", "Taylor"));
		employeeList.add(new Employee("3", "Dave", "Wilson"));
	}
	
	public List<Employee> getEmployeeList(){
		return employeeList; 
	}
}
