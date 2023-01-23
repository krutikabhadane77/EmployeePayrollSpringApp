package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "name")
    private String name;
    private long salary;

    private String gender;

    private String startDate;

    private String note;

    private String profilePic;
    @ElementCollection
    @CollectionTable(name = "employee_department",joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> department;

    public EmployeePayrollData( EmployeePayrollDTO employeePayrollDTO) {
        this.updateEmployeeEmployeePayrollData(employeePayrollDTO);
    }

    public void updateEmployeeEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.name = employeePayrollDTO.getName();
        this.salary = employeePayrollDTO.getSalary();
        this.gender = employeePayrollDTO.getGender();
        this.startDate = employeePayrollDTO.getStartDate();
        this.note = employeePayrollDTO.getNote();
        this.profilePic = employeePayrollDTO.getProfilePic();
        this.department = employeePayrollDTO.getDepartment();
    }
}