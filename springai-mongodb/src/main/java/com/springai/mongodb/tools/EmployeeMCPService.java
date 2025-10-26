package com.springai.mongodb.tools;

import com.springai.mongodb.entity.Employee;
import com.springai.mongodb.repository.EmployeeRepository;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMCPService {

    private EmployeeRepository employeeRepository;

    public EmployeeMCPService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //tools for managing employees will go here
    // Tool: Add Employee
    @Tool(description = "Add a new employee to the database")
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Tool: Update Employee
    @Tool(description = "Update an existing employee in the database")
    public Employee updateEmployee(int id, Employee employee) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    // Tool: Delete Employee
    @Tool(description = "Delete an employee from the database by ID")
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    // Tool: Get Employee
    @Tool(description = "Get an employee from the database by ID")
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Tool: List All Employees
    @Tool(description = "List all employees in the database")
    public Iterable<Employee> listAllEmployees() {
        return employeeRepository.findAll();
    }

    // Tool: Get Employee by Name
    @Tool(description = "Get an employee from the database by Name")
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findEmployeeByName(name);
    }
}
