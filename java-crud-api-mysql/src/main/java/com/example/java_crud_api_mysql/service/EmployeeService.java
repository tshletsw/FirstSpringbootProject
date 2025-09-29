package com.example.java_crud_api_mysql.service;

import com.example.java_crud_api_mysql.models.Employee;
import com.example.java_crud_api_mysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //Fetching all employee data
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //Fetching employee by ID
    public Optional<Employee> getEmployeeById(Long empId){
        return employeeRepository.findById(empId);
    }

    //Add new employee
    public void addNewEmployee(Employee empObj){
        employeeRepository.save(empObj);
    }

    //Deleting Employee by ID
    public void deleteEmployeeById(Employee employeeObj){
        employeeRepository.deleteById(employeeObj.getId());
    }

    //Updating Employee by ID
    public void updateEmployeeById(Employee employeeObj){
        employeeRepository.save(employeeObj);
    }

}
