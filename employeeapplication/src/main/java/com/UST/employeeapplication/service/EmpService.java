package com.UST.employeeapplication.service;

import com.UST.employeeapplication.entity.Employee;
import com.UST.employeeapplication.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepo repo;

    public Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(String id) {
        return repo.findByempId(id);
    }
    @Transactional
    public String deleteEmployeeByempId(String id) {
        repo.deleteByempId(id);
        return "the employee information is deleted" ;
    }
}