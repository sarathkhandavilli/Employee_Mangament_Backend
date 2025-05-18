package org.geeksforgeeks.gfg_spring_project.services;

import org.geeksforgeeks.gfg_spring_project.models.Employee;
import org.geeksforgeeks.gfg_spring_project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository ;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        //saves the employee into db
        return this.employeeRepository.save(employee) ;
    }

    public Employee getEmployeeById(long id) {
        // fetches the employee by Id and returns it.
        // return some employee
        Optional<Employee> employeeOptional = this.employeeRepository.findById(id) ;
        return employeeOptional.orElse(null);

    }

    public void deleteEmployee(long id) {
        this.employeeRepository.deleteById(id);
    }
}
