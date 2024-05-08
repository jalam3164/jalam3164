package com.curd.curdoperation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeRequest {

    private String empId;
    private String empFirstName;
    private String empLastName;
    private String empMailId;
    private String empAddress;

}
