package com.seinfeld.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private int employeeId;
    private String employeeName;
    private DivisionDTO division;
    private String employeeStartAt;
}
