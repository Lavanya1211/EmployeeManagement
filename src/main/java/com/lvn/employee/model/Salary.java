package com.lvn.employee.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "salary")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salary_id_seq")
    @SequenceGenerator(name = "salary_id_seq", sequenceName = "salary_id_seq", allocationSize = 1)
    @Column(name = "salary_id")
    private Long salaryId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "salary_amount")
    private BigDecimal salaryAmount;

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
