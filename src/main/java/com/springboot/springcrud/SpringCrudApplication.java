package com.springboot.springcrud;

import com.springboot.springcrud.model.Employee;
import com.springboot.springcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudApplication implements CommandLineRunner {

    public static void main(String[] args) {SpringApplication.run(SpringCrudApplication.class, args);}

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee= new Employee();
        employee.setFirstName("ramesh");
        employee.setLastName("Phadtare");
        employee.setEmailId("abc@123");

        employeeRepository.save(employee);

        Employee employee1= new Employee();
        employee1.setFirstName("Ram");
        employee1.setLastName("Jadhav");
        employee1.setEmailId("ram@123");

        employeeRepository.save(employee1);
    }
}
