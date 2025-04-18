package com.lvn.employee.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "EMPLOYEE_NAME")
	private String name;
	
	@Column(name = "EMAIL",unique = true, nullable = false)
	private String email;
	
	@Column(name = "PHONE_NUMBER")
	private String phone;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "PROJECT_NAME")
	private String project;
	
	@Column(name = "ROLE_NAME")
	private String role;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "DATE_OF_JOINED")
	private Date doj;
	
	

}
