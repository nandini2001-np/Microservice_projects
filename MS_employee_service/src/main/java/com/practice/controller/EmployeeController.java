package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dto.ApiResponseDTO;
import com.practice.dto.EmployeeDTO;
import com.practice.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")

public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@PostMapping("/save")
	public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDto){
		EmployeeDTO saveEmployee=service.saveEmployee(employeeDto);
		return new ResponseEntity<>(saveEmployee,HttpStatus.CREATED);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<ApiResponseDTO> getDepartmentByCode(@PathVariable ("id") Long id){
		ApiResponseDTO apiResponseDTO =service.getEmployeeById(id);
		return new ResponseEntity<>(apiResponseDTO,HttpStatus.OK);
	}

}
