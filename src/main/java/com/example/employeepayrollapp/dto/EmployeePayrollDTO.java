package com.example.employeepayrollapp.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.List;

@Data
public class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    @NotEmpty(message = "Employee Name should not be Null")
    private String name;

    @Min(value = 500,message = "Wage should be 500 or More")
    @Max(value = 999999,message = "Wage should not exceeds 999999")
    private long salary;

    @Pattern(regexp = "male|female",message = "Gender Needs to be Male or Female")
    private String gender;

    //@Pattern(regexp = "dd-MM-yyyy")
    @NotNull(message = "Start Date Should not be Empty")
    //@PastOrPresent(message = "Start Date Should be Past or Present Date")
    private String startDate;

    @NotBlank(message = "Note Should not be empty")
    private String note;

    @NotBlank(message = "Profile Pic should not be Empty")
    private String profilePic;

    @NotNull(message = "Department should not be Empty")
    private List<String> department;

}