package org.geeksforgeeks.gfg_spring_project.controllers;

import org.geeksforgeeks.gfg_spring_project.models.Employee;
import org.geeksforgeeks.gfg_spring_project.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService ;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return  this.employeeService.addEmployee(employee) ;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable long id) {
        return this.employeeService.getEmployeeById(id) ;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable long id) {
        this.employeeService.deleteEmployee(id);
        return "Employee Deleted Successfully!" ;
    }
}
