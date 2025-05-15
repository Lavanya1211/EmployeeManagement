package com.lvn.employee.model;

import java.sql.Timestamp;

import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_title")
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_title_seq")
    @SequenceGenerator(name = "job_title_seq", sequenceName = "job_title_seq", allocationSize = 1)
    @Column(name = "job_title_id")
    private Long jobTitleId;

    @Column(name = "job_title")
    private String jobTitle;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "created_by")
    private String createdBy;
    
    @Column(name = "updated_by")
    private String updatedBy;
    
    @Column(name = "created_on")
    private Timestamp createdOn;
    
    @Column(name = "updated_on")
    private Timestamp updatedOn;
}

