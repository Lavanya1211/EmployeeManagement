package com.lvn.employee.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "job_title")
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_title_seq")
    @SequenceGenerator(name = "job_title_seq", sequenceName = "job_title_seq", allocationSize = 1)
    private Long jobTitleId;

    private String jobTitle;
    private String description;
    private String status;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdOn;
    private Timestamp updatedOn;
}

