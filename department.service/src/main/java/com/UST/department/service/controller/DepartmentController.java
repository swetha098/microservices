package com.UST.department.service.controller;

import com.UST.department.service.entity.Department;
import com.UST.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService services;
    @PostMapping("/")
    public Department saveDepartmentById(@RequestBody Department department){
        return services.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentId(@PathVariable("id")Long departmentId){
        return services.findDepartmentById(departmentId);
    }


}
