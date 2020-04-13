package com.example.rest.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.rest.model.Employee;


@Repository
public class EmployeeDAO {
     
    private Map<Integer, Employee> DB = new HashMap<>();
     
    public List<Employee> getEmployeeList() 
    {
        List<Employee> list = new ArrayList<>();
        if(list.isEmpty()) {
            list.addAll(DB.values());
        }
        return list;
    }
     
    public Employee getEmployeeById(int id) {
        return DB.get(id);
    }
     
    public void addEmployee(Employee employee) {
        employee.setId(DB.keySet().size() + 1);
        DB.put(employee.getId(), employee);
    }
     
    public void updateEmployee(Employee employee) {
        DB.put(employee.getId(), employee);
    }
     
    public void deleteEmployee(int id) {
        DB.remove(id);
    }
}
