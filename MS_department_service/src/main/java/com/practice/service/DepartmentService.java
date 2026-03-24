package com.practice.service;

import com.practice.dto.DepartmentDTO;
import com.practice.entity.Department;

public interface DepartmentService {
	
	public DepartmentDTO saveDepartment(DepartmentDTO departmentdtos);
	public DepartmentDTO findDepartmentbycode(String departmentcode);
	
}
