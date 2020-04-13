package com.example.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.model.Employee;

@Service
public class EmployeeManager 
{
    @Autowired
    EmployeeDAO dao;
     
    public List<Employee> getEmployeeList() {
        return dao.getEmployeeList();
    }
     
    public Employee getEmployeeById(int id) {
        return dao.getEmployeeById(id);
    }
     
    public void addEmployee(Employee employee) {
        dao.addEmployee(employee);
    }
}