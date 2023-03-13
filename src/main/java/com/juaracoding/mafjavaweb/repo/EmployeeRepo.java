package com.juaracoding._01JavaWeb.repo;


import com.juaracoding._01JavaWeb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}