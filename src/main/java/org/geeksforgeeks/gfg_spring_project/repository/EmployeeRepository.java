package org.geeksforgeeks.gfg_spring_project.repository;

import org.geeksforgeeks.gfg_spring_project.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Long> {

    List<Employee> findBySalaryBetween(double salaryStart, double salaryEnd);
}

