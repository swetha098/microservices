package com.UST.employeeapplication.repository;


import com.UST.employeeapplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

    Employee findByempId(String id);

    void deleteByempId(String id);
}


