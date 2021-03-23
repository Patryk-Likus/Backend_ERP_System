package com.Backend_ERP_System.repository;

import com.Backend_ERP_System.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
