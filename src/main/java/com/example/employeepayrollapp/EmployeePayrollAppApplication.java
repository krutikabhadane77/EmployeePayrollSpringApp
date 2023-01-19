package com.example.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll App!!");
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
    }

}
