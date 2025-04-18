package com.lvn.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvn.employee.model.Employee;
import com.lvn.employee.service.EmployeeService;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/list")
    public List<Employee> listEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        System.out.println("employees======="+employees);
        return employees; 
    }

}

