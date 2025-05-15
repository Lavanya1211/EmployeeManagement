package com.lvn.employee.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_additional_information")
public class EmpInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_basic_info_id_seq")
    @SequenceGenerator(name = "emp_basic_info_id_seq", sequenceName = "emp_basic_info_id_seq", allocationSize = 1)
    private Long empBasicInfoId;

    @OneToOne
    @JoinColumn(name = "employeeId", unique = true)
    private Employee employee;

    private String gender;
    private String empEmail;
    private String linkedinProfileUrl;
    private String emergencyContact;
    private String maritalStatus;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdOn;
    private Timestamp updatedOn;
}

