package com.lvn.employee.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "salary")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salary_id_seq")
    @SequenceGenerator(name = "salary_id_seq", sequenceName = "salary_id_seq", allocationSize = 1)
    private Long salaryId;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    private BigDecimal salaryAmount;
    private String description;
    private String status;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdOn;
    private Timestamp updatedOn;
}

