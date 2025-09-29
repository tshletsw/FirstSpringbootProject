package com.example.java_crud_api_mysql.controller;

import com.example.java_crud_api_mysql.models.Employee;
import com.example.java_crud_api_mysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //End point to fetch all employees
    @GetMapping(value = "/allEmployees")
    public List<Employee> findAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //End point to fetch employee by ID
    @GetMapping(value = "/findEmployee{id}")
    public Optional<Employee> findEmployeeById(@PathVariable(value = "id") Long empId){
        return employeeService.getEmployeeById(empId);
    }

    //End point to add new employee
    @PostMapping(value ="/addEmployee")
    public void addNewEmployee(@RequestBody Employee empObj){
        employeeService.addNewEmployee(empObj);
    }

    //End point to update an employee
    @PutMapping(value = "/updateEmployee")
    public void updateNewEmployee(@RequestBody Employee empObj){
        employeeService.updateEmployeeById(empObj);
    }

    //End point to delete a user
    @DeleteMapping(value = "/deleteEmployee")
    public void deleteNewEmployee(@RequestBody Employee empObj){
        employeeService.deleteEmployeeById(empObj);
    }

}
