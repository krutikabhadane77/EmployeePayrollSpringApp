package com.example.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll App");
        ApplicationContext context = SpringApplication.run(EmployeePayrollAppApplication.class, args);
        log.info("Employee payroll App Started");
        log.info("Employee payroll App Started in "+ context.getEnvironment().getProperty("environment")+" Environment");
    }
}
