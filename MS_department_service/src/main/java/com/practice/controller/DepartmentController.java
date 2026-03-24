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

import com.practice.dto.DepartmentDTO;
import com.practice.service.DepartmentService;

@RestController
@RequestMapping("/api/department")

public class DepartmentController {
	
	@Autowired
	private DepartmentService service;
	
	@PostMapping("/save")
	public ResponseEntity<DepartmentDTO> saveDepartment(@RequestBody DepartmentDTO departmentdto){
		DepartmentDTO saveDepartment=service.saveDepartment(departmentdto);
		return new ResponseEntity<>(saveDepartment,HttpStatus.CREATED);
	}
	
	@GetMapping("/code/{code}")
	public ResponseEntity<DepartmentDTO> getDepartmentByCode(@PathVariable ("code") String code){
		DepartmentDTO departmentdto=service.findDepartmentbycode(code);
		return ResponseEntity.ok(departmentdto);
	}

}
