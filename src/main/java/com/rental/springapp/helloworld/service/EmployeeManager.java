package com.rental.springapp.helloworld.service;

import java.util.ArrayList;
import java.util.List;
import com.rental.springapp.helloworld.model.Employee;

public class EmployeeManager {
	private static List<Employee> employeeList;

	public EmployeeManager() {
		employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("1", "Mike", "Smith", "123 Test Drive, San Jose, CA 95124"));
		employeeList.add(new Employee("2", "John", "Taylor", "482 No Trang Long, P13, Q. BT, HCM"));
		employeeList.add(new Employee("3", "Dave", "Wilson", "22 Nguyen Thong, P12, Q. 3, HCM"));
		employeeList.add(new Employee("4", "Han", "Nguyen", "22 Nguyen Van Cu, P10, Q. 5, HCM"));
	}
	
	public List<Employee> getEmployeeList(){
		return employeeList; 
	}
}
