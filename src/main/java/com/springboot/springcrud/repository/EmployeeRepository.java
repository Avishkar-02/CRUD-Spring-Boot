package com.springboot.springcrud.repository;

import com.springboot.springcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee ,Long> {
    //all crud database methods

}


