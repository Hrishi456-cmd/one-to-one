package com.geekster.Mapping.repository;

import com.geekster.Mapping.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee,Long> {


}
