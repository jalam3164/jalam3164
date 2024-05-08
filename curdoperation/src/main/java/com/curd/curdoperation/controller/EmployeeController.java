package com.curd.curdoperation.controller;

import com.curd.curdoperation.dto.request.EmployeeRequest;
import com.curd.curdoperation.model.Employee;
import com.curd.curdoperation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee/v1/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee emp)
    {
        return employeeService.addEmployee(emp);
    }
    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee emp)
    {
        return employeeService.updateEmployee(emp);
    }
    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/{getById}")
    public Employee getEmployeeById(@PathVariable("getById") Integer getById)
    {
        return employeeService.getEmployeeById(getById);
    }
}
