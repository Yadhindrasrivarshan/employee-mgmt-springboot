package com.yadhipa.fullstackApi.services;

import com.yadhipa.fullstackApi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getEmployees();
}
