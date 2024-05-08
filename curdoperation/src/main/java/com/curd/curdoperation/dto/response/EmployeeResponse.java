package com.curd.curdoperation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeResponse {

    private String empFirstName;
    private String empLastName;
    private String empMailId;
    private String empAddress;


}
