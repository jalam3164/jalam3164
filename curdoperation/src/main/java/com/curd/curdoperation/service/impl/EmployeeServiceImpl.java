package com.curd.curdoperation.service.impl;

import com.curd.curdoperation.model.Employee;
import com.curd.curdoperation.repository.EmployeeRepo;
import com.curd.curdoperation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo empRepo;
    @Override
    public Employee addEmployee(Employee emp) {
        return empRepo.save(emp);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        return empRepo.save(emp);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return empRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer empId) {

                return empRepo.findById(empId).orElse(null);

    }
}
