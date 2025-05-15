package com.lvn.employee.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_seq")
    @SequenceGenerator(name = "department_seq", sequenceName = "department_seq", allocationSize = 1)
    	
	private Long departmentId;
	private String departmentName;
	private String description;
	private String status;
	private int createdBy;
	private int updatedBy;
	private Timestamp createdOn;
	private Timestamp updatedOn;
}

