package com.yadhipa.fullstackApi.services;


import com.fasterxml.jackson.databind.util.BeanUtil;
import com.yadhipa.fullstackApi.entities.EmployeeEntity;
import com.yadhipa.fullstackApi.model.Employee;
import com.yadhipa.fullstackApi.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {

        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);

        employeeRepository.save(employeeEntity);
        return employee;
    }

    @Override
    public List<Employee> getEmployees(){
        List<EmployeeEntity> employeeEntityList = employeeRepository.findAll();
        return employeeEntityList.stream().map(emp -> new Employee(emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getEmailId())).collect(Collectors.toList());
    }

}
