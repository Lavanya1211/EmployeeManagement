package com.lvn.employee.model;

import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee_additional_information")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_basic_info_id_seq")
    @SequenceGenerator(name = "emp_basic_info_id_seq", sequenceName = "emp_basic_info_id_seq", allocationSize = 1)
    @Column(name = "emp_basic_info_id")
    private Long empBasicInfoId;

    @OneToOne
    @JoinColumn(name = "employee_id", unique = true)
    private Employee employee;

    @Column(name = "gender")
    private String gender;

    @Column(name = "emp_email")
    private String empEmail;

    @Column(name = "linkedin_profile_url")
    private String linkedinProfileUrl;

    @Column(name = "emergency_contact")
    private String emergencyContact;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    @Column(name = "updated_on")
    private Timestamp updatedOn;
}
