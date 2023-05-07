package com.geekster.Mapping.controller;

import com.geekster.Mapping.models.Employee;
import com.geekster.Mapping.repository.IEmployeeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {

    IEmployeeRepository userRepository;
  @PostMapping(value = "/employee")

  void saveUser(@RequestBody Employee user)
  {
userRepository.save(user);
  }
}
