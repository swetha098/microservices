package com.UST.employeeapplication.controller;


import com.UST.employeeapplication.entity.Employee;
import com.UST.employeeapplication.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("/addemps")
    public Employee addEmployee(@RequestBody Employee employee) {

        return empService.createEmployee(employee);

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return empService.getEmployees();
    }

    @GetMapping ("/employees/{id}")
    public Employee getAllEmployees(@PathVariable String id){
        return empService.getEmployeeById(id);
    }

    @DeleteMapping("/deleteemployee/{id}")
    public String deleteEmployee(@PathVariable String id) {
        return empService.deleteEmployeeByempId(id);
    }
}

