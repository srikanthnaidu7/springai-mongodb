package com.springai.mongodb.repository;

import com.springai.mongodb.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
    Employee findEmployeeById(int id);
    void deleteEmployeeById(int id);
    Employee findEmployeeByName(String name);
}
