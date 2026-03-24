package com.practice.service;

import com.practice.dto.ApiResponseDTO;
import com.practice.dto.EmployeeDTO;
import com.practice.entity.Employee;

public interface EmployeeService {
	
	EmployeeDTO saveEmployee(EmployeeDTO employeeDto);
	ApiResponseDTO getEmployeeById(Long id);

}
