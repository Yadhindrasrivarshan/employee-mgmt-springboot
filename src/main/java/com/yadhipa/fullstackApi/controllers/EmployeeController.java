package com.yadhipa.fullstackApi.controllers;


import com.yadhipa.fullstackApi.model.Employee;
import com.yadhipa.fullstackApi.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;
    public  EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }


    @PostMapping("/employees")

    public Employee createEmployee(@RequestBody  Employee employee){

        return  employeeService.createEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }


}
