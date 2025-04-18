package com.lvn.employee.serviceImpl;

import com.lvn.employee.model.Employee;
import com.lvn.employee.repo.EmployeeRepo;
import com.lvn.employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

}
