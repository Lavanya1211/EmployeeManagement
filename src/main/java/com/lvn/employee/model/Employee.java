package com.lvn.employee.model;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq", allocationSize = 1)
    private Long employeeId;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date joiningDate;
    private Date dateOfBirth;

    private String status;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "jobTitleId")
    private JobTitle jobTitle;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private int manager;
}

