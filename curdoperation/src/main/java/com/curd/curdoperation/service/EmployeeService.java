package com.curd.curdoperation.service;

import com.curd.curdoperation.model.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {

    public Employee addEmployee(Employee emp);
    public Employee updateEmployee(Employee emp);
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(Integer empId);


}
