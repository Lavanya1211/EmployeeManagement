package com.lvn.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewsController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	/**
	 * this is used to show the list of employees
	 * @return
	 */
	@GetMapping("/employee/list")
	public String employeeList() {
	    return "employeeList"; 
	}

	@GetMapping("/employee/add")
	public String addEmployee() {
		return "addEmployee";
	}
}
