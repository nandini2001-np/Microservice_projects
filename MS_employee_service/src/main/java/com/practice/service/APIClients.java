package com.practice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.dto.DepartmentDTO;

@FeignClient(name="DEPARTMENT-SERVICE")

public interface APIClients {
	
	@GetMapping("/api/department/code/{code}")
	public DepartmentDTO getDepartmentByCode(@PathVariable ("code") String code);

	
}
